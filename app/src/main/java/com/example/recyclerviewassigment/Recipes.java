package com.example.recyclerviewassigment;

public class Recipes {
    private String heading;
    private String body;

    public Recipes(String heading, String body) {
        this.heading = heading;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}
