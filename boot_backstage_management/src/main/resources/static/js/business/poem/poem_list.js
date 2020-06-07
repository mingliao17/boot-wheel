layui.use('table', function () {
    var $ = layui.$;
    var table = layui.table

    var poem ={
        tableId: "poemTable",
        condition: {
            id: ""
        }
    }



    /**
     * 初始化表格的列
     */
    poem.initColumn = function () {
        return [[
            {checkbox: true, fixed: 'left'}
            , {field: 'id', title: 'ID', width: 100, sort: true, fixed: 'left'}
            , {field: 'poem_name', title: '名称', width: 200, fixed: 'left'}
            , {field: 'author', title: '作者', width: 200, sort: true}
            , {field: 'dynasty', title: '朝代', width: 200}
            , {field: 'poem_content', title: '内容', width: 550}
            , {field: 'label', title: '分类', width: 200}
            , {field: 'translation', title: '释义', width: 200}
            , {field: 'about_the_author', title: '关于作者', width: 200}
        ]];
    };

    /**
     * 渲染表格
     */
    var tableResult = table.render({
        id: 'poem_table_id',
        elem: '#' + poem.tableId,
        url: '/poem/selectPoemList',
        page: true,
        height: "full-150",
        cellMinWidth: 100,
        cols: poem.initColumn() //initColumn方法要放在渲染表格之后，js是从上往下执行
    });

    /**
     * 点击查询按钮
     */
    poem.search = function () {
        var queryData = {};
        queryData['poemName'] = $("#poemName").val();
        queryData['author'] = $("#author").val();
        queryData['dynasty'] = $("#dynasty").val();
        table.reload(poem.tableId, {
            where: queryData, page: {curr: 1}
        });
    };



    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        poem.search();
    });

    //新增按钮点击事件
    $('#btnAdd').click(function () {
        //弹出新增页面
        var url = "/poem/turnPoemAdd";
        layer.open({
            type:2,
            title:'<h4 style="font-size: 18px;padding-top: 10px">诗词新增</h4>',
            area:['90%','80%'],
            fixed:false,
            maxmin:true,
            content:url,
            end: function () {
                poem.search();
            }
        });
    });

    //修改按钮点击事件
    $('#btnUpdate').click(function () {
        var url = "/poem/turnPoemUpdate";
        layer.open({
            type:2,
            title:'<h4 style="font-size: 18px;padding-top: 10px">诗词修改</h4>',
            area:['90%','80%'],
            fixed:false,
            maxmin:true,
            content:url,
            end: function () {
                poem.search();
            }
        });
    });

    //删除点击事件
    $('#btnDel').click(function () {
        var checkStatus = table.checkStatus('poem_table_id');
        alert(checkStatus.data);
        alert(checkStatus.data.length);
        alert(checkStatus.data[0].poem_name);
       /* $.ajax({
            url: "/poem/poemDel",
            type: "post",
            dataType: "json",
            // data: {'name':value},
            async: false,
            success: function (data) {
                layer.alert(data.msg,{icon:1,title:'信息提示'});
            }
        });*/
    });

    //导出点击事件
    $('#btnExport').click(function () {
        //ajax导出
    });

});
