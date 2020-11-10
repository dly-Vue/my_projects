window.onload = () => {
    let lunbos = document.getElementsByClassName("lunbo");//得到轮播的div
    let dots = document.getElementsByClassName("dots")[0].getElementsByTagName("div");
    let videos = document.getElementsByClassName("videos");
    let lunboBtn = document.getElementsByClassName("btn");
    let close = document.getElementsByClassName("close");
    let now = 0;
    let next = -1;
    for (let i = 1; i < lunbos.length; i++) {
        lunbos[i].style.left = "100%";
    }
    for (let i = 0; i < dots.length; i++) {
        /*添加点击事件，点击圆点，图片移动 */
        dots[i].onclick = () => {

            for (let j = 0; j < dots.length; j++) {
                /*判断是否为改点 */
                if (j != i) {
                    dots[j].className = "";
                }
                dots[i].className = "on";
                lunbos[i].style.opacity = "1";
                /*轮播点加颜色 */
                next = i;

            }
            lunboChange(next);
        }
    }
    /*实现图片移动 */
    function lunboChange(next) {
        /* 便利数组，对当前的图片和下一张图片是指透明度为1，其余为0，轮播后图片下标小的在左边，下标大的在右边*/
        for (let i = 0; i < lunbos.length; i++) {
            if ((i == next) || (i == now)) {
                lunbos[i].style.opacity = "1";
                console.log(lunbos[i].style.opacity);
            }
            else {
                lunbos[i].style.opacity = "0";
                if (i < next) {
                    lunbos[i].style.left = "-100%";
                }
                if (i > next) {
                    lunbos[i].style.left = "100%";
                }
                console.log(lunbos[i].style.opacity);
            }

        }
        /*判断图片向左移还是向右移 */
        if (next > now) {
            lunbos[now].style.left = "-100%";
            lunbos[now].style.transition = "left 1s";
            lunbos[next].style.left = "0%";
            lunbos[next].style.transition = "left 1s";
            videos[now].style.marginTop = "-24400px";
            videos[now].getElementsByTagName("video")[0].pause();

        } else if (next < now) {
            lunbos[now].style.left = "100%";
            lunbos[now].style.transition = "left 1s";
            lunbos[next].style.left = "0%";
            lunbos[next].style.transition = "left 1s";
            videos[now].style.marginTop = "-24400px";
            videos[now].getElementsByTagName("video")[0].pause();
        }
        now = next;
    }
    /* 点击加载视频*/

    for (let i = 0; i < close.length; i++) {
        lunboBtn[i].onclick = () => {
            videos[i].style.marginTop = "-244px";
            videos[i].getElementsByTagName("video")[0].play();
        }
        close[i].onclick = () => {
            videos[i].style.marginTop = "-24400px";
            /*视频暂停 */
            videos[i].getElementsByTagName("video")[0].pause();
        }
    }

}