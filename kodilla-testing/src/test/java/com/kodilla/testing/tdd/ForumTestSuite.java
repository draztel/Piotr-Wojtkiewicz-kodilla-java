package com.kodilla.testing.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Executing test number #" + testCounter);
    }

    @Test
    public void testAddPost() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");

        forumUser.addPost("draztel", "karasie jedzo gowno");

        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }
    @Test
    public void testAddComment() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");
        ForumPost thePost = new ForumPost("karasie jedzo gowno", "draztel");

        forumUser.addComment("daztel", thePost, "naprawde");

        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    public void testGetPost() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");
        ForumPost thePost = new ForumPost("karasie jedzo gowno", "draztel");

        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        Assert.assertEquals(null, retrievedPost);
    }
    @Test
    public void testGetComment() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");
        ForumPost thePost = new ForumPost("karasie jedzo gowno", "draztel");
        ForumComment theComment = new ForumComment(thePost, "naprawde", "draztel");
        forumUser.addComment(theComment.getAuthor(),thePost, theComment.getCommentBody());

        ForumComment retrievedComment = forumUser.getComment(0);

        Assert.assertEquals(theComment, retrievedComment);
    }
    @Test
    public void testRemovePostNotExisting() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");
        ForumPost thePost = new ForumPost("karasie jedzo gowno", "draztel");

        boolean result = forumUser.removePost(thePost);

        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");
        ForumPost thePost = new ForumPost("karasie jedzo gowno","draztel");
        ForumComment theComment = new ForumComment(thePost, "naprawde","draztel");

        boolean result = forumUser.removeComment(theComment);

        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");
        ForumPost thePost = new ForumPost("karasie jedzo gowno", "draztel");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        boolean result = forumUser.removePost(thePost);

        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment() {
        ForumUser forumUser = new ForumUser("draztel", "Piotr Wojtkiewicz");
        ForumPost thePost = new ForumPost("karasie jedzo gowno","draztel");
        ForumComment theComment = new ForumComment(thePost, "naprawde","draztel");
        forumUser.addComment(theComment.getAuthor(), thePost, theComment.getCommentBody());

        boolean result = forumUser.removeComment(theComment);

        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
