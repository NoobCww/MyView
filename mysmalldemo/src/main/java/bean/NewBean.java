package bean;

import java.util.List;

/**
 * Created by 威威 on 2017/12/5.
 */

public class NewBean {

    /**
     * i : 6894681
     * r : 3
     * m : 71147,1242
     * d : []
     * e : [{"imgurl":"http://capp.dameiketang.com/Uploads/images/indexgg/59f9729a2db67.jpg","target":"lesson://1285","outline":"0"},{"imgurl":"http://capp.dameiketang.com/Uploads/images/indexgg/59e60a29212d1.jpg","target":"lesson://1275","outline":"0"},{"imgurl":"http://capp.dameiketang.com/Uploads/images/indexgg/59db0cccd24c6.jpg","target":"lesson://1287","outline":"0"},{"imgurl":"http://capp.dameiketang.com/Uploads/images/indexgg/59b0f9e2d8dc3.jpg","target":"lesson://584","outline":"0"}]
     * h : [{"id":"1249","all_time":null,"outline":"0","lesson_name":"【名师有约第十期】资深时尚化妆造型师\u2014\u2014K.Kay","teacher":"K.Kay","is_look":"0","price":"68","one_type_id":"47","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1499929497.jpg","big_img_url":"http://capp.dameiketang.com/Uploads/bigadvertisement/1499929497.jpg","two_type_id":"49"},{"id":"614","all_time":null,"outline":"0","lesson_name":"四款简单秋天主题美甲","teacher":"斯蒂 Kirsty","is_look":"1","price":"0","one_type_id":"4","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1481522480.jpg","big_img_url":"http://capp.dameiketang.com/Uploads/bigadvertisement/1481522480.jpg","two_type_id":"5"},{"id":"449","all_time":null,"outline":"0","lesson_name":"创意美甲-- 简约","teacher":"斯蒂 Kirsty","is_look":"0","price":"0","one_type_id":"4","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1476779714.jpg","big_img_url":"http://capp.dameiketang.com/Uploads/bigadvertisement/1476779714.jpg","two_type_id":"5"},{"id":"282","all_time":null,"outline":"0","lesson_name":"罗小林365天晨训系列第四周","teacher":"美业教育第一人 罗小林","is_look":"0","price":"6","one_type_id":"32","small_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1471584682.jpg","big_img_url":"http://capp.dameiketang.com/Uploads/smalladvertisement/1471584682.jpg","two_type_id":"34"}]
     * c : [{"teacher_id":"121","teacher_name":"李汶縚","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1479109002.jpg"},{"teacher_id":"151","teacher_name":"岳晓琳","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1496216094.jpg"},{"teacher_id":"159","teacher_name":"胡社光","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1501635973.jpg"},{"teacher_id":"153","teacher_name":"K.Kay","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1498529522.jpg"},{"teacher_id":"155","teacher_name":"楚威","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1500622769.jpg"},{"teacher_id":"141","teacher_name":"晴晴","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1492675472.jpg"},{"teacher_id":"140","teacher_name":"辛丹华","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1491898121.jpg"},{"teacher_id":"106","teacher_name":"张勇","teacher_img":"http://capp.dameiketang.com/Uploads/bigadvertisement/1476701381.jpg"}]
     * l : [{"name":"OBC美甲","img":"http://api.dameiketang.com/Public/obcmeijia.jpg","lesson_id":209},{"name":"OBC美发","img":"http://api.dameiketang.com/Public/obcmeifa.jpg","lesson_id":210},{"name":"半永久双线班","img":"http://api.dameiketang.com/Public/byj.jpg","lesson_id":175},{"name":"美睫双线班","img":"http://api.dameiketang.com/Public/mmj.jpg","lesson_id":173}]
     * t : 1512471149
     */

    private int i;
    private String r;
    private String m;
    private int t;
    private List<?> d;
    private List<EBean> e;
    private List<HBean> h;
    private List<CBean> c;
    private List<LBean> l;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public List<?> getD() {
        return d;
    }

    public void setD(List<?> d) {
        this.d = d;
    }

    public List<EBean> getE() {
        return e;
    }

    public void setE(List<EBean> e) {
        this.e = e;
    }

    public List<HBean> getH() {
        return h;
    }

    public void setH(List<HBean> h) {
        this.h = h;
    }

    public List<CBean> getC() {
        return c;
    }

    public void setC(List<CBean> c) {
        this.c = c;
    }

    public List<LBean> getL() {
        return l;
    }

    public void setL(List<LBean> l) {
        this.l = l;
    }

    public static class EBean {
        /**
         * imgurl : http://capp.dameiketang.com/Uploads/images/indexgg/59f9729a2db67.jpg
         * target : lesson://1285
         * outline : 0
         */

        private String imgurl;
        private String target;
        private String outline;

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getOutline() {
            return outline;
        }

        public void setOutline(String outline) {
            this.outline = outline;
        }
    }

    public static class HBean {
        /**
         * id : 1249
         * all_time : null
         * outline : 0
         * lesson_name : 【名师有约第十期】资深时尚化妆造型师——K.Kay
         * teacher : K.Kay
         * is_look : 0
         * price : 68
         * one_type_id : 47
         * small_img_url : http://capp.dameiketang.com/Uploads/smalladvertisement/1499929497.jpg
         * big_img_url : http://capp.dameiketang.com/Uploads/bigadvertisement/1499929497.jpg
         * two_type_id : 49
         */

        private String id;
        private Object all_time;
        private String outline;
        private String lesson_name;
        private String teacher;
        private String is_look;
        private String price;
        private String one_type_id;
        private String small_img_url;
        private String big_img_url;
        private String two_type_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getAll_time() {
            return all_time;
        }

        public void setAll_time(Object all_time) {
            this.all_time = all_time;
        }

        public String getOutline() {
            return outline;
        }

        public void setOutline(String outline) {
            this.outline = outline;
        }

        public String getLesson_name() {
            return lesson_name;
        }

        public void setLesson_name(String lesson_name) {
            this.lesson_name = lesson_name;
        }

        public String getTeacher() {
            return teacher;
        }

        public void setTeacher(String teacher) {
            this.teacher = teacher;
        }

        public String getIs_look() {
            return is_look;
        }

        public void setIs_look(String is_look) {
            this.is_look = is_look;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getOne_type_id() {
            return one_type_id;
        }

        public void setOne_type_id(String one_type_id) {
            this.one_type_id = one_type_id;
        }

        public String getSmall_img_url() {
            return small_img_url;
        }

        public void setSmall_img_url(String small_img_url) {
            this.small_img_url = small_img_url;
        }

        public String getBig_img_url() {
            return big_img_url;
        }

        public void setBig_img_url(String big_img_url) {
            this.big_img_url = big_img_url;
        }

        public String getTwo_type_id() {
            return two_type_id;
        }

        public void setTwo_type_id(String two_type_id) {
            this.two_type_id = two_type_id;
        }
    }

    public static class CBean {
        /**
         * teacher_id : 121
         * teacher_name : 李汶縚
         * teacher_img : http://capp.dameiketang.com/Uploads/bigadvertisement/1479109002.jpg
         */

        private String teacher_id;
        private String teacher_name;
        private String teacher_img;

        public String getTeacher_id() {
            return teacher_id;
        }

        public void setTeacher_id(String teacher_id) {
            this.teacher_id = teacher_id;
        }

        public String getTeacher_name() {
            return teacher_name;
        }

        public void setTeacher_name(String teacher_name) {
            this.teacher_name = teacher_name;
        }

        public String getTeacher_img() {
            return teacher_img;
        }

        public void setTeacher_img(String teacher_img) {
            this.teacher_img = teacher_img;
        }
    }

    public static class LBean {
        /**
         * name : OBC美甲
         * img : http://api.dameiketang.com/Public/obcmeijia.jpg
         * lesson_id : 209
         */

        private String name;
        private String img;
        private int lesson_id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getLesson_id() {
            return lesson_id;
        }

        public void setLesson_id(int lesson_id) {
            this.lesson_id = lesson_id;
        }
    }
}
