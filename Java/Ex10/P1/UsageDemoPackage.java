import mygame.shared.*;
import mygame.client.*;
import mygame.server.*;
class UsageDemoPackage {
  public static void main(String[] args) {
   Utilities v1 = new  Utilities();
   Server v2 = new Server();
   Client v3 = new Client();
   v1.methodClass();
   v2.methodClass();
   v3.methodClass();
  }
}