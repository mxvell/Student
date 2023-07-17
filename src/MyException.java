public class MyException extends Throwable{
    @Override
    public  String getMessage(){
        return "you can't add new student";
    }

}
