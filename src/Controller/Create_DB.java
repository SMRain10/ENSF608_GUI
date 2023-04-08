import java.sql.*;
import java.util.ArrayList;

public class Create_DB {

    static final String DB_URL = "jdbc:mysql://localhost:3306?allowMultiQueries=true";
    static final String USER = "root";
    static final String PASS = "ensfsos";

    // public ArrayList<String> InsertIntoTable() {
    // ArrayList<String> result = new ArrayList<String>();

    // try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);)
    // {
    // String sql = " insert into users (first_name, last_name, date_created,
    // is_admin, num_points)"+" values (?, ?, ?, ?, ?)";

    // int HealthCareNum;
    // String Pname;
    // int PhoneNum;
    // String Allergies;
    // String FamilyHistory;
    // String Smoker;
    // int Date;
    // String Gender;
    // String Pre_existing_conditions;
    // String City;
    // String Province;
    // String StreetAddress;
    // int AdminSSN;

    // PreparedStatement preparedStmt = conn.prepareStatement(sql);
    // preparedStmt.setString (1, first_name);
    // preparedStmt.setString (2, last_name);
    // preparedStmt.setDate (3, date_created);
    // preparedStmt.setBoolean(4, is_admin);
    // preparedStmt.setInt (5, num_points);

    // preparedStmt.execute();
    // conn.close();

    // } catch (SQLException e) {
    // e.printStackTrace();
    // }

    // return result;
    // }

    public ArrayList<String> ViewInsurance() {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM insurance");

            while (rs.next()) {
                String companyID = rs.getString("companyid");
                String taxcode = rs.getString("taxcode");
                float insuranceRate = rs.getFloat("insurancerate");
                System.out.println(
                        "companyID: " + companyID + "---taxcode:  " + taxcode + "----insurancerate: " + insuranceRate);
            }

            return null;

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("update failed");

            return null;
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }

    }

    public String DeleteInsurance() {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            String table = "Insurance";

            // new values
            String CompanyID = "AB";
            String TaxCode = "AB";
            float InsuranceRate = 0.3f;

            // old id
            String id = "testcomp";

            String sql = "delete from " + table + " where CompanyID= ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // String sql = "update insurance set companyid = 'asf' , taxcode = 'asdf',
            // insurancerate = 0.7 where companyid = 'testcomp'";

            stmt.setString(1, CompanyID);
            // stmt.setString(2, TaxCode);
            // stmt.setFloat(3, InsuranceRate);
            // stmt.setString(4, id);

            stmt.execute();
            conn.close();

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

    public String UpdateInsurance() {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            Statement stmt_use = conn.createStatement();
            stmt_use.executeUpdate("use HOSPITAL");

            String table = "Insurance";

            // new values
            String CompanyID = "AB";
            String TaxCode = "AB";
            float InsuranceRate = 0.3f;

            // old id
            String id = "CIBC";

            String sql = "update  " + table + " SET CompanyID= ? , TaxCode = ? , InsuranceRate = ? where CompanyID = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // String sql = "update insurance set companyid = 'asf' , taxcode = 'asdf',
            // insurancerate = 0.7 where companyid = 'testcomp'";

            stmt.setString(1, CompanyID);
            stmt.setString(2, TaxCode);
            stmt.setFloat(3, InsuranceRate);
            stmt.setString(4, id);

            stmt.execute();
            // conn.close();

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

    public Object[][] searchDoctor(String docId, String name, String healthCareNum) {

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


    public void InsertDcotor() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("use HOSPITAL");

            String table = "Insurance";
            String CompanyID = "testcomp";
            String TaxCode = "ted";
            float InsuranceRate = 0.4f;

            String sql = " insert into " + table + " (CompanyID, TaxCode, InsuranceRate)" + " values (?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            // preparedStmt.setString (1, table);
            preparedStmt.setString(1, CompanyID);
            preparedStmt.setString(2, TaxCode);
            preparedStmt.setFloat(3, InsuranceRate);

            preparedStmt.execute();
            conn.close();


        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("Insert failed: Primary key already exists");

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
























    // DONE
    public String InsertIntoInsurance() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("use HOSPITAL");

            String table = "Insurance";
            String CompanyID = "testcomp";
            String TaxCode = "ted";
            float InsuranceRate = 0.4f;

            String sql = " insert into " + table + " (CompanyID, TaxCode, InsuranceRate)" + " values (?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            // preparedStmt.setString (1, table);
            preparedStmt.setString(1, CompanyID);
            preparedStmt.setString(2, TaxCode);
            preparedStmt.setFloat(3, InsuranceRate);

            preparedStmt.execute();
            conn.close();

            return null;

        } catch (SQLIntegrityConstraintViolationException e) {
            // Handle duplicate primary key error
            System.out.println("Insert failed: Primary key already exists");

            return "exists";
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }

    }

    public static void main(String[] args) {

        // try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {

        // Statement stmt = conn.createStatement();

        // stmt.executeUpdate("use HOSPITAL");

        // String query = "INSERT INTO mytable (myintcolumn, mystringcolumn) VALUES (?,
        // ?)";
        // stmt.prepareStatement(query);

        // // First Query, get all the students and print out their information
        // ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");

        // while (rs.next()) {
        // String firstname = rs.getString("first_name");
        // String lastname = rs.getString("last_name");
        // String StudentID = rs.getString("student_id");
        // String location = rs.getString("location");
        // System.out.println(
        // "Student Name: " + firstname + " " + lastname + " ID: " + StudentID + "
        // location: " + location);

        // }
        // System.out.println();

        // // Second Query, get all the Course names and course titles
        // Statement stmt2 = conn.createStatement();
        // ResultSet rs2 = stmt2.executeQuery("SELECT * FROM COURSE");

        // while (rs2.next()) {
        // String Course_Name = rs2.getString("Course_Name");
        // String title = rs2.getString("Course_Title");
        // String name = rs2.getString("Course_Name");
        // System.out.println("Course Name: " + Course_Name + " Course Title:" + title +
        // " Course Name: " + name);
        // }
        // System.out.println();

        // // Third Qeury, find all the registrations
        // Statement stmt3 = conn.createStatement();
        // ResultSet rs3 = stmt3.executeQuery("SELECT * FROM REGISTRATION");

        // while (rs3.next()) {
        // String Registration_ID = rs3.getString("Registration_ID");
        // String Course_ID = rs3.getString("Course_ID");
        // String Student_ID = rs3.getString("Student_ID");
        // System.out.println("Registration ID: " + Registration_ID + " Course ID: " +
        // Course_ID + " Student ID: "
        // + Student_ID);
        // }

        // } catch (SQLException e) {
        // e.printStackTrace();
        // }

    }

}