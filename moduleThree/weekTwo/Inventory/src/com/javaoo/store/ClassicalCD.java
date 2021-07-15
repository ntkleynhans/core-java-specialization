package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
    private String composer;
    private String[] performers = new String[5];
    private String recordingLocation;
    private Date releaseDate;
    private int performerCount = 0;

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void addPerformer(String performer) {
        if(performerCount < performers.length) {
            performers[performerCount++] = performer;
        } else {
            System.out.println("There are no slots left to add performer");
        }
    }

    public void showPerformer() {
        if(performerCount > 0) {
            for(String perform : performers ) {
                System.out.format("Performer: %s%n", perform);
            }
        } else {
            System.out.println("There are no performers for this Classical CD");
        }
    }
}
