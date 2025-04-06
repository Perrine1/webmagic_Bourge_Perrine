package us.codecraft.webmagic.utils;

import us.codecraft.webmagic.ResultItems;

import java.io.PrintWriter;
import java.util.Map;

public abstract class AbstractPipeline {

    protected void writeResultItems(ResultItems resultItems, PrintWriter printWriter) {
        printWriter.println("url:\t" + resultItems.getRequest().getUrl());
        for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
            if (entry.getValue() instanceof Iterable) {
                Iterable value = (Iterable) entry.getValue();
                printWriter.println(entry.getKey() + ":");
                for (Object o : value) {
                    printWriter.println(o);
                }
            } else {
                printWriter.println(entry.getKey() + ":\t" + entry.getValue());
            }
        }
        
    }
}

