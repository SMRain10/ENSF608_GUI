import java.sql.*;
import java.util.ArrayList;

public class Create_DB_final {

    static final String DB_URL = "jdbc:mysql://localhost:3306?allowMultiQueries=true";
    static final String USER = "root";
    static final String PASS = "ensfsos";



    //Returns the maximum document ID for diagnosis doucment
    public int maxDocID(){

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            Statement stmt = conn.createStatement();
            String querey = "SELECT MAX(DocumentID) FROM DIAGNOSIS";

            ResultSet rs = stmt.executeQuery(querey);

            rs.next();
            return rs.getInt("MAX(DocumentID)");

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

            return -1;
        } catch (SQLException e) {
            e.printStackTrace();

            return -1;
        }

    }

    //returns an array for routine checkups
    public Object[][] searchRoutineCheckUp(String docId, String name, String healthCareNum) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            Statement stmt = conn.createStatement();

            String querey = "select DocumentID, Pname, Allergies, Familyhistory, Smoker, BirthDate, Pre_exisiting_Conditions, Notes, Resolved from patient, diagnosis where patient.HealthCareNum = diagnosis.healthcarenum and DocType = 'Routine_Checkup'";
            String docIDsearch = "and DocumentID like ";
            String nameSearh = "and Pname like ";
            String healthCareNumSearch = "and patient.HealthCareNum like";
            ;

            if (docId != "") {
                docIDsearch += "'%" + docId + "%'";
                querey += docIDsearch;
            }
            if (name != "") {
                nameSearh += "'%" + name + "%'";
                querey += nameSearh;
            }
            if (healthCareNum != "") {
                healthCareNumSearch += "'%" + healthCareNum + "%'";
                querey += healthCareNumSearch;
            }

            ResultSet rs = stmt.executeQuery(querey);
            ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
            while (rs.next()) {
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(rs.getString("DocumentID"));
                temp.add(rs.getString("Pname"));
                temp.add(rs.getString("Allergies"));
                temp.add(rs.getString("Familyhistory"));
                temp.add(rs.getString("Smoker"));
                temp.add(rs.getString("BirthDate"));
                temp.add(rs.getString("Notes"));
                temp.add(rs.getString("Resolved"));

                results.add(temp);
            }

            Object[][] objectArray = new Object[results.size()][];

            for (int i = 0; i < results.size(); i++) {
                ArrayList<String> innerList = results.get(i);
                Object[] innerArray = new Object[innerList.size()];
                for (int j = 0; j < innerList.size(); j++) {
                    innerArray[j] = innerList.get(j);
                }
                objectArray[i] = innerArray;
            }

            return objectArray;

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

            return null;
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }

    }

    //updates a single routine checkup document
    public String UpdateRoutineCheckUp(String notes, Boolean resolved, Integer healthCareNumber, Integer documentID) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            String table = "DIAGNOSIS";

            String sql = "update  " + table
                    + " SET Notes= ? , Resolved = ? where DocumentID = ? and HealthCareNum = ? and DocType = 'Routine_Checkup'";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // String sql = "update insurance set companyid = 'asf' , taxcode = 'asdf',
            // insurancerate = 0.7 where companyid = 'testcomp'";

            stmt.setString(1, notes);
            stmt.setBoolean(2, resolved);
            stmt.setInt(3, documentID);
            stmt.setInt(4, healthCareNumber);

            stmt.execute();

            return null;

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

            return "exists";
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    //inserts a routine checkup document
    public void InsertRoutineCheckUp(String notes, int healthCareNum, int docID, boolean resolved) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("use HOSPITAL");

            String table = "DIAGNOSIS";
            String docType = "Routine_Checkup";

            String sql = " insert into " + table + " (DocumentID, HealthCareNum, Notes, Resolved, DocType)"
                    + " values (?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt(1, docID);
            preparedStmt.setInt(2, healthCareNum);
            preparedStmt.setString(3, notes);
            preparedStmt.setBoolean(4, resolved);
            preparedStmt.setString(5, docType);

            preparedStmt.execute();
            conn.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("Insert failed: Primary key already exists");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    //deletes a routine checkup document
    public void DeleteRoutineCheckUp(int docID) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            String table = "DIAGNOSIS";
            String sql = "delete from " + table + " where DocumentID= ? and DocType = 'Routine_Checkup'";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, docID);

            stmt.execute();

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    //inserts a lab test document
    public void InsertLabTest(String notes, int healthCareNum, int docID, boolean resolved, String testType) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("use HOSPITAL");

            String table = "DIAGNOSIS";
            String docType = "Lab_Test";

            String sql = " insert into " + table
                    + " (DocumentID, HealthCareNum, Notes, Resolved, DocType, TestType, Results)"
                    + " values (?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt(1, docID);
            preparedStmt.setInt(2, healthCareNum);
            preparedStmt.setString(3, notes);
            preparedStmt.setBoolean(4, resolved);
            preparedStmt.setString(5, docType);
            preparedStmt.setString(6, testType);

            preparedStmt.execute();
            conn.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("Insert failed: Primary key already exists");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public Object[][] searchLabTest(String docId, String name, String healthCareNum) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            Statement stmt = conn.createStatement();

            String querey = "select DocumentID, Pname, Allergies, Notes, Results from patient, diagnosis where patient.HealthCareNum = diagnosis.healthcarenum and DocType = 'Lab_Test'";
            String docIDsearch = "and DocumentID like ";
            String nameSearh = "and Pname like ";
            String healthCareNumSearch = "and patient.HealthCareNum like";
            ;

            if (docId != "") {
                docIDsearch += "'%" + docId + "%'";
                querey += docIDsearch;
            }
            if (name != "") {
                nameSearh += "'%" + name + "%'";
                querey += nameSearh;
            }
            if (healthCareNum != "") {
                healthCareNumSearch += "'%" + healthCareNum + "%'";
                querey += healthCareNumSearch;
            }

            ResultSet rs = stmt.executeQuery(querey);
            ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
            while (rs.next()) {
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(rs.getString("DocumentID"));
                temp.add(rs.getString("Pname"));
                temp.add(rs.getString("Allergies"));
                temp.add(rs.getString("Notes"));
                temp.add(rs.getString("Results"));

                results.add(temp);
            }

            Object[][] objectArray = new Object[results.size()][];

            for (int i = 0; i < results.size(); i++) {
                ArrayList<String> innerList = results.get(i);
                Object[] innerArray = new Object[innerList.size()];
                for (int j = 0; j < innerList.size(); j++) {
                    innerArray[j] = innerList.get(j);
                }
                objectArray[i] = innerArray;
            }

            return objectArray;

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

            return null;
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }

    }


    public void DeleteLabTest(int docID) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            String table = "DIAGNOSIS";
            String sql = "delete from " + table + " where DocumentID= ? and DocType = 'Lab_Test'";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, docID);

            stmt.execute();

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }




    public String UpdateLabTest(String notes, Boolean resolved, Integer healthCareNumber, Integer documentID, String testType, String result) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            String table = "DIAGNOSIS";

            String sql = "update  " + table
                    + " SET Notes= ? , Resolved = ? , testType = ?, result = ? where DocumentID = ? and HealthCareNum = ? and DocType = 'Lab_Test'";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // String sql = "update insurance set companyid = 'asf' , taxcode = 'asdf',
            // insurancerate = 0.7 where companyid = 'testcomp'";

            stmt.setString(1, notes);
            stmt.setBoolean(2, resolved);
            stmt.setString(3, testType);
            stmt.setString(4, result);
            stmt.setInt(5, documentID);
            stmt.setInt(6, healthCareNumber);

            stmt.execute();

            return null;

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

            return "exists";
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }













    public void Registration(String name, int healthCareNum,String phone, String allergies, String familyHistory, String smoker, String birthDate, String gender,
    String preExistingConditions, String city, String province, String streetAddress) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("use HOSPITAL");

            String table = "Patient";


            String sql = " insert into " + table
                    + " (HealthCareNum, Pname, PhoneNum, Allergies, Familyhistory, Smoker, BirthDate, Gender, Pre_exisiting_Conditions, City, Province, StreetAddress)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt(1, healthCareNum);
            preparedStmt.setString(2, name);
            preparedStmt.setString(3, phone);
            preparedStmt.setString(4, allergies);
            preparedStmt.setString(5, familyHistory);
            preparedStmt.setString(6, smoker);
            preparedStmt.setString(7, birthDate);
            preparedStmt.setString(8, gender);
            preparedStmt.setString(9, preExistingConditions);
            preparedStmt.setString(10, city);
            preparedStmt.setString(11, province);
            preparedStmt.setString(12, streetAddress);


            preparedStmt.execute();
            conn.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("Insert failed: Primary key already exists");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }





    public void AdminRegistration(String name, int healthCareNum,String phone, String allergies, String familyHistory, String smoker, String birthDate, String gender,
    String preExistingConditions, String city, String province, String streetAddress, int admintSSN) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("use HOSPITAL");

            String table = "Patient";


            String sql = " insert into " + table
                    + " (HealthCareNum, Pname, PhoneNum, Allergies, Familyhistory, Smoker, BirthDate, Gender, Pre_exisiting_Conditions, City, Province, StreetAddress, AdminSSN)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt(1, healthCareNum);
            preparedStmt.setString(2, name);
            preparedStmt.setString(3, phone);
            preparedStmt.setString(4, allergies);
            preparedStmt.setString(5, familyHistory);
            preparedStmt.setString(6, smoker);
            preparedStmt.setString(7, birthDate);
            preparedStmt.setString(8, gender);
            preparedStmt.setString(9, preExistingConditions);
            preparedStmt.setString(10, city);
            preparedStmt.setString(11, province);
            preparedStmt.setString(12, streetAddress);
            preparedStmt.setInt(13, admintSSN);


            preparedStmt.execute();
            conn.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("Insert failed: Primary key already exists");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }








    



}