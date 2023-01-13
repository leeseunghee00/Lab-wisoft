## Wisoft Seminar

### 1. Database
⚙️ 환경 설정
| 사이트 | 링크 |
|---|---|
| supabase | https://supabase.com/ |
| Datagrip | https://www.jetbrains.com/datagrip/ |
| PostgreSQL | https://www.postgresql.org/ |
| IntelliJ | https://www.jetbrains.com/ko-kr/idea/ |

※ javac 11.0.17 사용

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlAccess {
    private static Connection conn = null;

    public void init(){
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection setConnection(){
        String url = "<supabase url>";
        String username = "****";
        String password = "****";

        try{
            conn = DriverManager.getConnection(url, username, password);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}

```

### 2. Operating System
- book : Operating System Concepts 10th
