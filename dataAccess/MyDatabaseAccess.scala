import java.sql.{DriverManager, Connection, Statement, ResultSet,SQLException}

// 実行時にclasspathを指定する
// exec
// scala -classpath ./mysql-connector-java-8.0.17.jar MyDatabaseAccess.scala
object MyDatabaseAccess {
    def main(args: Array[String]): Unit = {
        // change here
        val user: String = "root"
        val host: String = "172.17.0.2:3306"
        val password: String = "mysql"
        val conn_url: String = "jdbc:mysql://" + host + "/mysql?user=" + user + "&password=" + password
        // print(conn_url)
        
        val sql: String = "SELECT Host, User FROM user ;"

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            val conn = DriverManager.getConnection(conn_url)
            try{
                val statement = conn.createStatement()
                val res = statement.executeQuery(sql)
                while(res.next()){
                    print(res.getString(1) + " : ")
                    println(res.getString(2))
                }
                statement.close()
            }catch{
                case e: Exception => println(e)
            }finally{
                conn.close()
            }
        }catch{
            case e: Exception => println(e)
        }finally{
        }
    }
}