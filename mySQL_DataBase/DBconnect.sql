public class Main {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{

        Main pro  = new Main();
        pro.createConnection();


    }
    void createConnection() throws ClassNotFoundException, SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/innocent", "root", "Bn19c0248@");
        Statement statement = connection.createStatement();
        ResultSet re = statement.executeQuery("SELECT * FROM client");

        while(re.next()){
            String name = re.getString("client_name");
            int client_id = re.getInt("client_id");
            int branch_id = re.getInt("branch_id");



            System.out.println("Client: "+client_id + " ---> " + "Client_name: "+name  + "----> "+  "Branch_name: "+branch_id);
        }
        System.out.println("Database connection is successful");
    }
}
