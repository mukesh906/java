interface MainAccount{
  public void AC_NO(); // interface method
}

interface SAVING {
  public void ac_no(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class LOAN implements MAIN_ACCOUNT,SAVING {
  public void AC_NO() {
    System.out.println("9861");
  }
  public void ac_no() {
    System.out.println("9862");
  }
}

class Main {
  public static void main(String[] args) {
    LOAN l = new LOAN();
    l.AC_NO();
    l.ac_no();
  }
}