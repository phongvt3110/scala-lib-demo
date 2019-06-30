import org.ici.{Comunication =>JavaCom, Logger => JavaLog}
object DemoICIlib {
  def main(args: Array[String]): Unit = {
    JavaCom.SayHello()
    JavaCom.Version()
    val comm = new JavaCom
    comm.SayHello("Phongvt651043")
    comm.SayGoodbye("Phongvt651043")
    JavaLog.info("Info from java lib")
    JavaLog.warning("warning from java lib")
  }
}
