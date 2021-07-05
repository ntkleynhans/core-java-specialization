package com.lq.exercises;

public class StringDetail {
    private StringBuilder builder;

    public StringDetail() {
        builder = new StringBuilder();
    }

    public StringDetail(String start) {
        builder = new StringBuilder();
        setBuilder(start);
    }

    public void setBuilder(String text) {
        builder.insert(0, text);
    }

    /**
     * Add text to the underlying StringBuilder object
     * <p>
     * @param text String to be inserted into the StringBuilder
     */
    public void addText(String text) {
        builder.append(text);
    }

    /**
     * Return the string representation of the StringBuilder
     * @return String representation of the StringBuilder
     */
    public String getBuilder() {
        return builder.toString();
    }
}
