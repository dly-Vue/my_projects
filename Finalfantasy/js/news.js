window.onload = () => {
    let list = document.getElementsByClassName("header_content_bottom")[0];
    let button = document.getElementsByClassName("button")[0];
    /*最新情报的数组*/ 
    let arr = [{
        img1: "../image/a1.jpg",
        title: "蛮神竞速挑战赛竞猜规则正式公布！",
        des: "第二届蛮神竞速挑战赛竞猜规则正式公布",
        time: "2020/09/28 19:40:34",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a2.jpg",
        title: "10/1道具商城新道具追加：东方雅士&东方美玉套装",
        des: "最终幻想14道具商城即将上架新道具：东方雅士套装、东方美玉套装",
        time: "2020/09/28 13:47:14",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a3.jpg",
        title: "超大型猫大胖软垫等商品预售开启！",
        des: "超大型猫大胖软垫、烹调师猴面雀玩偶、暗之战士游戏鼠标垫、漆黑的群像拼图预售开启！",
        time: "2020/09/24 12:01:55",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a4.jpg",
        title: "莫古莫古★大收集 ~追忆的法典 9月15日开幕！",
        des: "「莫古莫古★大收集」是不定期举办的特殊活动。活动期间通过攻略副本，可以获取「稀少法典神典石」，如果将「稀少法典神典石」交给旅行莫古力还能获得丰厚道具奖励。",
        time: "2020/09/14 15:38:45",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a5.jpg",
        title: "「群狼盛宴」第十五赛季火热进行中！",
        des: "「群狼盛宴」第十五赛季正在如火如荼进行中，快来和高手们切磋高下，一展身手吧！",
        time: "2020/09/15 18:45:49",
        img2: "../image/a0.png"
    }, {
        img1: "../image/a1.jpg",
        title: "蛮神竞速挑战赛竞猜规则正式公布！",
        des: "第二届蛮神竞速挑战赛竞猜规则正式公布",
        time: "2020/09/28 19:40:34",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a2.jpg",
        title: "10/1道具商城新道具追加：东方雅士&东方美玉套装",
        des: "最终幻想14道具商城即将上架新道具：东方雅士套装、东方美玉套装",
        time: "2020/09/28 13:47:14",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a3.jpg",
        title: "超大型猫大胖软垫等商品预售开启！",
        des: "超大型猫大胖软垫、烹调师猴面雀玩偶、暗之战士游戏鼠标垫、漆黑的群像拼图预售开启！",
        time: "2020/09/24 12:01:55",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a4.jpg",
        title: "莫古莫古★大收集 ~追忆的法典 9月15日开幕！",
        des: "「莫古莫古★大收集」是不定期举办的特殊活动。活动期间通过攻略副本，可以获取「稀少法典神典石」，如果将「稀少法典神典石」交给旅行莫古力还能获得丰厚道具奖励。",
        time: "2020/09/14 15:38:45",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a5.jpg",
        title: "「群狼盛宴」第十五赛季火热进行中！",
        des: "「群狼盛宴」第十五赛季正在如火如荼进行中，快来和高手们切磋高下，一展身手吧！",
        time: "2020/09/15 18:45:49",
        img2: "../image/a0.png"
    }
        , {
        img1: "../image/a1.jpg",
        title: "蛮神竞速挑战赛竞猜规则正式公布！",
        des: "第二届蛮神竞速挑战赛竞猜规则正式公布",
        time: "2020/09/28 19:40:34",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a2.jpg",
        title: "10/1道具商城新道具追加：东方雅士&东方美玉套装",
        des: "最终幻想14道具商城即将上架新道具：东方雅士套装、东方美玉套装",
        time: "2020/09/28 13:47:14",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a3.jpg",
        title: "超大型猫大胖软垫等商品预售开启！",
        des: "超大型猫大胖软垫、烹调师猴面雀玩偶、暗之战士游戏鼠标垫、漆黑的群像拼图预售开启！",
        time: "2020/09/24 12:01:55",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a4.jpg",
        title: "莫古莫古★大收集 ~追忆的法典 9月15日开幕！",
        des: "「莫古莫古★大收集」是不定期举办的特殊活动。活动期间通过攻略副本，可以获取「稀少法典神典石」，如果将「稀少法典神典石」交给旅行莫古力还能获得丰厚道具奖励。",
        time: "2020/09/14 15:38:45",
        img2: "../image/a0.png"
    },
    {
        img1: "../image/a5.jpg",
        title: "「群狼盛宴」第十五赛季火热进行中！",
        des: "「群狼盛宴」第十五赛季正在如火如荼进行中，快来和高手们切磋高下，一展身手吧！",
        time: "2020/09/15 18:45:49",
        img2: "../image/a0.png"
    }
    ];
    let str = '';
    let n = 5;
    /*使用循环将列表加入进去*/
    for (let i = 0; i < n; i++) {
        str += '<div class="header_list">';
        str += ' <a href="#">';
        str += '   <div class="header_list_left">';
        str += '    <img src="' + arr[i].img1 + '">';
        str += '  </div>';
        str += '  <div class="header_list_right">';
        str += '     <div class="list_right_title">' + arr[i].title + '</div>';
        str += '    <div class="list_right_des">' + arr[i].des + '</div>';
        str += '    <div class="list_right_time">';
        str += '        <div class="time1">' + arr[i].time + '</div>';
        str += '       <div class="time2">';
        str += '    <img src="' + arr[i].img2 + '">';
        str += '  </div>';
        str += ' </div>';
        str += ' </div>';
        str += '  </a>';
        str += ' </div>';
    }
    /*将列表数据全部打印 */
    list.innerHTML = str;
    /*每次点击都会加两条数据*/ 
    button.onclick = () => {
        n = n + 2;
        if (n > arr.leng) {
            return;
        }
        for (let i = n - 2; i < n; i++) {
            str += '<div class="header_list">';
            str += ' <a href="#">';
            str += '   <div class="header_list_left">';
            str += '    <img src="' + arr[i].img1 + '">';
            str += '  </div>';
            str += '  <div class="header_list_right">';
            str += '    <div class="list_right_title">' + arr[i].title + '</div>';
            str += '    <div class="list_right_des">' + arr[i].des + '</div>';
            str += '    <div class="list_right_time">';
            str += '    <div class="time1">' + arr[i].time + '</div>';
            str += '    <div class="time2">';
            str += '    <img src="' + arr[i].img2 + '">';
            str += '  </div>';
            str += ' </div>';
            str += ' </div>';
            str += '  </a>';
            str += ' </div>';
        }
        /*点击之后再次打印 */
        list.innerHTML = str;
    }

}