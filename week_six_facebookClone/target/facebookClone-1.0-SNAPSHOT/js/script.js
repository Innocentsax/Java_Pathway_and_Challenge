document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('post-form');
    const postsContainer = document.getElementById('posts-container');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const postInput = document.getElementById('post-input');
        const postContent = postInput.value.trim();

        if (postContent !== '') {
            createPost(postContent);
            postInput.value = '';
        }
    });

    function createPost(content) {
        const postElement = document.createElement('div');
        postElement.classList.add('post');

        const postContent = document.createElement('div');
        postContent.classList.add('post-content');
        postContent.textContent = content;

        const likeButton = document.createElement('button');
        likeButton.classList.add('like-button');
        likeButton.textContent = 'Like';

        let likesCount = 0;
        const likesElement = document.createElement('span');
        likesElement.classList.add('post-likes');
        likesElement.textContent = likesCount + ' likes';

        likeButton.addEventListener('click', function() {
            likesCount++;
            likesElement.textContent = likesCount + ' likes';
        });

        postElement.appendChild(postContent);
        postElement.appendChild(likeButton);
        postElement.appendChild(likesElement);

        postsContainer.prepend(postElement);
    }
});
