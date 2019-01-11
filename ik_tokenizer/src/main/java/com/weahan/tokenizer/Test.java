package com.weahan.tokenizer;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;

/**
 * @Author Rock Lee
 * @Date 2019/1/11 0011 14:45
 */
public class Test {
    public static void main(String[] args) {
        int [] symbolsArr = {'<','>','+','-','='};
        for (int i : symbolsArr){
            System.out.print(i +"\t");
        }

        IKSegmenter ikSegmenter = new IKSegmenter(new StringReader("双下肢动脉。粥样硬化，并 < > >= : 斑块形成！ 》 《 >"),true);
        try {
            Lexeme lexeme = ikSegmenter.next();
            while (lexeme != null){
                System.out.print(lexeme.getLexemeText() +"\t");
                lexeme = ikSegmenter.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
