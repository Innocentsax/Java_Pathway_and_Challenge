package model;

public class Post {
    private int postId;
    private User user;
    private String post;
    private int likes;

    public Post(int postId, User user, String post, int likes) {
        this.postId = postId;
        this.user = user;
        this.post = post;
        this.likes = likes;
    }

    public Post() {

    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", user=" + user +
                ", post='" + post + '\'' +
                ", likes=" + likes +
                '}';
    }
}
