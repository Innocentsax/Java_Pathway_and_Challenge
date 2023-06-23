package InputOutput;

import java.io.Serializable;

public class User implements Serializable {
    String username;
    transient String password;
    int id;
}
