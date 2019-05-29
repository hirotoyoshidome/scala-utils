// オブジェクトの生成(オブジェクト、クラス、トレイトのいずれかに対してメソッドを実装する)
object HelloWorld{
  // メソッドの定義
  def main(args: Array[String]){
    if(args.size == 0) {
      //イミュータブルな変数
      val strs = Array("Hello", "World")
        output(strs)
    } else {
          printf("Invalid args.")
    }
  }

  // privateメソッド(Unitは戻り値がないことvoidのこと)
  private def output(strs: Array[String]):Unit = {
    for(str <- strs) {
      printf("%s ", str)
    }
  }
}
