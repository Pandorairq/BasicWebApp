package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Pandorairq";
        }
        else if (query.contains("what is")) {
            int i = query.indexOf("is%20");
            String str = query.substring(i + 5,i + 7);
            String str2 = query.substring(i + 8,i + 10);
            int a = Integer.parseInt(str);
            int b = Integer.parseInt(str2);
            return Integer.toString((a + b));
        }
        else if(query.contains("which of the following numbers is the largest")) {
            String[] strings = query.split(",%20");
            int i = query.indexOf(":");
            String str = query.substring(i + 5,i + 7);
            String str2 = query.substring(i + 8,i + 10);
            int a = Integer.parseInt(str);
            int b = Integer.parseInt(str2);
            return Integer.toString((a + b));
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}

