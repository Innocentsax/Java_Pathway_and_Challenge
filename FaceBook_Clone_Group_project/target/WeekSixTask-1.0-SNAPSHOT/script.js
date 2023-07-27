$(document).ready(()=>{
    $("#new-account").click(()=>{
        $("#container-2").fadeIn(400);
    });

    $("#back-to-login").click(()=>{
        $("#container-2").fadeOut(400);
    });
    $("#new-post").click(()=>{
        $("#post").fadeIn(500);
        $("#new-post").hide();
        $("#save-post").fadeIn(600);
    });
});