package learning;

public class Main {
	public static final String a = "Hello World";
    //メインメソッド
	public static void main(String[] args, int a) {

		// TODO 自動生成されたメソッド・スタブ

		System.out.println(a);
		// +加算 -減算 *乗算 /除算
        //nullは未参照（空ではない）
		boolean b = true;
		System.out.println(b);
		//条件分岐 if文 case文 switch文
		// ==, >, <, >=, <=
		int i = 10;
		if(i == 10) {
			System.out.println("1");
		}else if (i >= 10){
			System.out.println("2");
		}else {
			System.out.println("3");
			if(i < 5){
				System.out.println("4");
			}
		}
		if(true)//処理が一つの場合{}なしも可
			System.out.println("Hello");

		switch(i){
		  case 10:
		  case 11:
            System.out.println("case10");
			System.out.println("case11");
			break;
		  case 100:
			System.out.println("case100");
			//break;
		  default:
			System.out.println("default");
		  break;
		}

      int age;
      age = 20;

      if(age >= 20) {
    	System.out.println("OK");
        if(age >= 60){
    	  System.out.println("老人");
        }
      }else{
          System.out.println("NG");
      }



      String str1 = null;
      String str2 = "ナレッジ";
      str2 = str2 + "ソフトウェア";
      System.out.println(args[0]);
      System.out.println(args[1]);
      //  nullは参照なしということ null ""
      //  ==は参照アドレスの比較
      //  equalsメソッドは一文字ずつ（値）の比較
      //and は &
      //or  は ||
      //制御文は可読性を意識する(出来るだけシンプルに！)
      if(str2 != null) { //str2のnull確認
        if(!"ナレッジ".equals(str1)) {
      //⇨nullに対してメソッドを使用すると落ちるパターンの回避
      	    System.out.println("OK");
        }else {
    	  System.out.println("NG");
        }
      }

	}
}
