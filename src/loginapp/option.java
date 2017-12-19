package loginapp;

public enum option {
    Admin , Student;

public String value(){
    return name();

}

public static option fromvalue(String v){
    return valueOf(v);
}

}

