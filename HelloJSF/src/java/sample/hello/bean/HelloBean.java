package sample.hello.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.validation.constraints.Size;

@Named(value = "helloBean")     //ManagedBean定義
@SessionScoped                  //スコープ定義
public class HelloBean implements Serializable {

    @Size(max = 10 , message = "10文字以内で入力してください")  //Bean検証
    private String word;
    
    public HelloBean() {   }    //デフォルトコンストラクタ定義

    //アクセサメソッドの定義
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
