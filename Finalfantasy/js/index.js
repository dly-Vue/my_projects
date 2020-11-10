window.onload = () => {
    let btn_right = document.getElementsByClassName("button_right");//得到右边按钮
    let btn_left = document.getElementsByClassName("button_left");//得到左边按钮
    let lunbo = document.getElementsByClassName("lunbo");
    let container = document.getElementsByClassName("content_mid")[0];//得到轮播的父级
    let dots=document.getElementsByClassName("button_bottom")[0].getElementsByTagName("div");
    let now = 0, next_now = 0, next = 0;
    let boo = false;
    let auto = null;
    lunbo[now + 1].className = "lunbo lunbo2";
    lunbo[3].className = "lunbo lunbo3";
    // 点击右边的按钮，图片向右移动
    btn_right[0].onclick = () => {
        if (boo == true) {
            return 0;
        }
        boo = true;
        now = now + 1;
        next = now - 1;
        if (now > 3) {
            now = 0;
            next = 3;
        }
        /*将下一张左移*/
        lunbo[now].style.opacity = 1;
        lunbo[now].style.transition = "left 0.5s";
        lunbo[now].style.left = "0%";
        dots[now].className="on";
        dots[next].className="";
        /*将这一张左移 */
        lunbo[next].style.left = "-100%";
        lunbo[next].style.transition = "left 0.5s";
        lunbo[next].className = "lunbo";
        lunbo[now].className = "lunbo lunbo1";
        next_now = now + 1;
        if (next_now > 3) {
            next_now = 0;
        }
        lunbo[next_now].className = "lunbo lunbo2";
        /*设施时间段，将本张图片回到原处*/
        setTimeout(() => {
            lunbo[next].style.transition = "";
            lunbo[next].style.opacity = 0;
            next = next - 1;
            if (next < 0) {
                next = 3;
            }
            lunbo[next].style.left = "";
            lunbo[now].style.transition = "";
            lunbo[now].style.left = "";
            boo = false;
        }, 500);
    }
    //点击向左的按钮，图片向左移动
    btn_left[0].onclick = () => {
        if (boo == true) {
            return 0;
        }
        boo = true;
        now = now - 1;
        next = now + 1;
        if (now < 0) {
            now = 3;
            next = 0;
        }
        /*将这一张右移 */
        lunbo[now].style.opacity = 1;
        lunbo[now].style.transition = "left 0.5s";
        lunbo[now].style.left = "0%";
        dots[now].className="on";
        dots[next].className="";
        /*将这一张右移 */
        lunbo[next].style.left = "100%";
        lunbo[next].style.transition = "left 0.5s";
        lunbo[next].className = "lunbo";
        lunbo[now].className = "lunbo lunbo1";
        next_now = now - 1;
        if (next_now < 0) {
            next_now = 3;
        }
        lunbo[next_now].className = "lunbo lunbo3";
        /*设施时间段，将本张图片回到原处*/
        setTimeout(() => {
            lunbo[next].style.transition = "";
            lunbo[next].style.opacity = 0;
            next = next + 1;
            if (next > 3) {
                next = 0;
            }
            lunbo[next].style.left = "";
            lunbo[now].style.transition = "";
            lunbo[now].style.left = "";
            boo = false;
        }, 500);
    }
    // 绑定鼠标移动进轮播图时，自动轮播停止，使用setInterval返回来的auto
    container.onmouseover = () => {
        clearInterval(auto);
    }

    // 绑定鼠标移动出轮播图时，自动轮播重新开启
    container.onmouseout = () => {
        lunbo_pik();
    }

    /*自动轮播，2s一次*/
    function lunbo_pik() {
        auto = setInterval(() => {
            btn_right[0].onclick();
        }, 2000)
    }

    lunbo_pik();
}
