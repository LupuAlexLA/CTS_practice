package test2.comportamentale.observer;

public class YoutubeChannel extends Observable {
    private String channelName;
    private String latestVideo;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public String getLatestVideo() {
        return latestVideo;
    }

    public void setLatestVideo(String latestVideo) {
        this.latestVideo = latestVideo;
    }

    public void publishNewVideo() {
        super.sendNotifications("Channel name: " + channelName + " uploaded: " + latestVideo);
    }
}
