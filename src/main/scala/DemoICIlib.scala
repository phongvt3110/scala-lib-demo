import org.ici.core._
import org.ici.{Comunication =>JavaCom, Logger => JavaLog}
object DemoICIlib {
  def main(args: Array[String]): Unit = {
    Logger.info("This is the beginning of the program")
    DemoLib.hello
    val hello = new DemoLib
    hello.hello
    hello.goodbye
    hello.goodbye("Phongvt")
    val email = Email.fromString("Phongvt@gmail.com")
    email match {
      case Some(email) => println(
        s"""Registered an email
           |Username: ${email.username}
           |Domain name: ${email.domainName}
     """)
      case None => println("Error: could not parse email")
    }
    val x = new X
    x.m(3)
    x.n(5)
    val xx = X.g(x)
    println(s"X.g(x): $xx")
    JavaCom.SayHello()
    JavaCom.Version()
    val comm = new JavaCom
    comm.SayHello("Phongvt651043")
    comm.SayGoodbye("Phongvt651043")
    JavaLog.info("Info from java lib")
    JavaLog.warning("warning from java lib")
  }
}
