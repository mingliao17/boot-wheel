function poemAdd() {
    var poemName = $("#poemName").val();
    var author = $("#author").val();
    var dynasty = $("#dynasty").val();
    var poemContent = $("#poemContent").val();

    $.ajax({
        url: "/poem/poemAdd",
        type: "post",
        dataType: "json",
        data: {
            'poemName': poemName,
            'author': author,
            'dynasty': dynasty,
            'poemContent': poemContent,
        },
        async: false,
        success: function (data) {
            layer.alert(data.msg, {icon: 1, title: '信息提示'});
        }
    });
}