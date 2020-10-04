package com.learning.core;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.apache.log4j.BasicConfigurator;

import java.util.List;

public class SentimentAnalysisExample {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        StanfordCoreNLP stanfordCoreNLP=Pipeline.getPipeline();
        String text = "I am not feeling good about it. I love ice cream. i might go there";
        CoreDocument coreDocument= new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences= coreDocument.sentences();
        for(CoreSentence sentence: sentences){
            String sentiment= sentence.sentiment();
            System.out.println(sentence+" = "+sentiment);
        }

    }
}
