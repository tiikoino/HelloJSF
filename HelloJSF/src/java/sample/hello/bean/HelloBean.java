package sample.hello.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.validation.constraints.Size;

@Named(value = "helloBean")
@SessionScoped
public class HelloBean implements Serializable {

    @Size(max = 10 , message = "10文字以内で入力してください")
    private String word;
    
    public HelloBean() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
