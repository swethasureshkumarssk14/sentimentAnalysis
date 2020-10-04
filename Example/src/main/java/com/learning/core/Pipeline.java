package com.learning.core;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {
    private static final Properties properties;
    private static StanfordCoreNLP stanfordCoreNLP;
    private Pipeline(){

    }
    static{
        properties= new Properties();
        String propertiesName = "tokenize,ssplit,pos,parse,sentiment";
        properties.setProperty("annotators", propertiesName);
    }
    public static StanfordCoreNLP getPipeline(){
        if(stanfordCoreNLP==null){
            stanfordCoreNLP= new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }

}
