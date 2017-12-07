package bean;

import java.util.List;

/**
 * Created by 威威 on 2017/11/23.
 */

public class BeautifulBean {


    /**
     * i : {"list":[{"name":"OBC美甲","img":"img/obcmeijia.jpg","lid":"209"},{"name":"OBC美发","img":"img/obcmeifa.jpg","lid":"210"},{"name":"半永久双线班","img":"img/byj.jpg","lid":"175"},{"name":"美睫双线班","img":"img/mmj.jpg","lid":"173"},{"name":"网红妆双线班","img":"img/wh.jpg","lid":"200"}],"img":"http://api.dameiketang.com/Appapi/select/lessonimg/sx.jpg","name":"双线课专区"}
     * d : [{"name":"精品专区","id":"47","type":"1","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/jp.jpg"},{"name":"美发","id":"9","type":"2","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/mf.jpg"},{"name":"化妆","id":"19","type":"2","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/hz.jpg"},{"name":"美甲","id":"5","type":"2","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/mj.jpg"},{"name":"美容","id":"26","type":"2","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/mr.jpg"},{"name":"美学","id":"14","type":"2","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/mx.jpg"},{"name":"经营","id":"32","type":"1","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/jy.jpg"},{"name":"女神塑造","id":"42","type":"1","original":"","img":"http://api.dameiketang.com/Appapi/select/lessonimg/ns.jpg"}]
     * m : [[{"name":"精品全部","id":"47","type":"1"},{"name":"名师有约","id":"49","type":"2"}],[{"name":"美发全部","id":"9","type":"2"},{"name":"造型","id":"10","type":"3"},{"name":"洗护","id":"11","type":"3"},{"name":"剪发","id":"12","type":"3"},{"name":"烫染","id":"13","type":"3"}],[{"name":"化妆全部","id":"19","type":"2"},{"name":"生活妆","id":"20","type":"3"},{"name":"舞台妆","id":"21","type":"3"},{"name":"工作妆","id":"22","type":"3"},{"name":"特效化妆","id":"23","type":"3"},{"name":"新娘妆","id":"24","type":"3"},{"name":"整体造型","id":"25","type":"3"}],[{"name":"美甲全部","id":"5","type":"2"},{"name":"生活","id":"6","type":"3"},{"name":"职场","id":"7","type":"3"},{"name":"艺术","id":"8","type":"3"}],[{"name":"美容全部","id":"26","type":"2"},{"name":"基础美容","id":"27","type":"3"},{"name":"面部美容","id":"28","type":"3"},{"name":"塑造身体","id":"29","type":"3"},{"name":"SPA养生","id":"30","type":"3"},{"name":"中医美容","id":"31","type":"3"}],[{"name":"美学全部","id":"14","type":"2"},{"name":"素描","id":"15","type":"3"},{"name":"形象","id":"16","type":"3"},{"name":"色彩","id":"17","type":"3"},{"name":"DIY","id":"18","type":"3"}],[{"name":"经营全部","id":"32","type":"1"},{"name":"业绩倍增","id":"33","type":"2"},{"name":"经验管理","id":"34","type":"2"},{"name":"团队建设","id":"35","type":"2"},{"name":"资本运作","id":"36","type":"2"}],[{"name":"女神全部","id":"42","type":"1"},{"name":"生活休闲","id":"43","type":"2"},{"name":"职场经营","id":"44","type":"2"},{"name":"主题活动","id":"45","type":"2"},{"name":"塑形养生","id":"46","type":"2"}]]
     * t : {"在职者":{"id":"4","name":"在职者","type":"1"},"美甲应用":{"id":"5","name":"美甲应用","type":"2"},"生活":{"id":"6","name":"生活","type":"3"},"职场":{"id":"7","name":"职场","type":"3"},"艺术":{"id":"8","name":"艺术","type":"3"},"美发应用":{"id":"9","name":"美发应用","type":"2"},"造型":{"id":"10","name":"造型","type":"3"},"洗护":{"id":"11","name":"洗护","type":"3"},"剪发":{"id":"12","name":"剪发","type":"3"},"烫染":{"id":"13","name":"烫染","type":"3"},"美学应用":{"id":"14","name":"美学应用","type":"2"},"素描":{"id":"15","name":"素描","type":"3"},"形象":{"id":"16","name":"形象","type":"3"},"色彩":{"id":"17","name":"色彩","type":"3"},"DIY":{"id":"18","name":"DIY","type":"3"},"化妆应用":{"id":"19","name":"化妆应用","type":"2"},"生活妆":{"id":"20","name":"生活妆","type":"3"},"舞台妆":{"id":"21","name":"舞台妆","type":"3"},"工作妆":{"id":"22","name":"工作妆","type":"3"},"特效化妆":{"id":"23","name":"特效化妆","type":"3"},"新娘妆":{"id":"24","name":"新娘妆","type":"3"},"整体造型":{"id":"25","name":"整体造型","type":"3"},"美容应用":{"id":"26","name":"美容应用","type":"2"},"基础美容":{"id":"27","name":"基础美容","type":"3"},"面部美容":{"id":"28","name":"面部美容","type":"3"},"塑造身体":{"id":"29","name":"塑造身体","type":"3"},"SPA养生":{"id":"30","name":"SPA养生","type":"3"},"中医美容":{"id":"31","name":"中医美容","type":"3"},"经营者":{"id":"32","name":"经营者","type":"1"},"业绩倍增":{"id":"33","name":"业绩倍增","type":"2"},"经营管理":{"id":"34","name":"经营管理","type":"2"},"团队建设":{"id":"35","name":"团队建设","type":"2"},"资本运作":{"id":"36","name":"资本运作","type":"2"},"初学者":{"id":"37","name":"初学者","type":"1"},"OBC美容":{"id":"38","name":"OBC美容","type":"2"},"OBC美发":{"id":"39","name":"OBC美发","type":"2"},"OBC化妆":{"id":"40","name":"OBC化妆","type":"2"},"OBC美甲":{"id":"41","name":"OBC美甲","type":"2"},"爱好者课程":{"id":"42","name":"爱好者课程","type":"1"},"生活休闲":{"id":"43","name":"生活休闲","type":"2"},"职场经营":{"id":"44","name":"职场经营","type":"2"},"主题活动":{"id":"45","name":"主题活动","type":"2"},"塑形养生":{"id":"46","name":"塑形养生","type":"2"},"精品课":{"id":"47","name":"精品课","type":"1"},"后起之秀":{"id":"48","name":"后起之秀","type":"2"},"名师有约":{"id":"49","name":"名师有约","type":"2"},"双线课":{"id":"50","name":"双线课","type":"1"},"其它":{"id":"51","name":"其它","type":"2"},"在职双线班":{"id":"52","name":"在职双线班","type":"2"},"OBC双线班":{"id":"54","name":"OBC双线班","type":"2"}}
     */

    private IBean i;
    private TBean t;
    private List<DBean> d;
    private List<List<MBean>> m;

    public IBean getI() {
        return i;
    }

    public void setI(IBean i) {
        this.i = i;
    }

    public TBean getT() {
        return t;
    }

    public void setT(TBean t) {
        this.t = t;
    }

    public List<DBean> getD() {
        return d;
    }

    public void setD(List<DBean> d) {
        this.d = d;
    }

    public List<List<MBean>> getM() {
        return m;
    }

    public void setM(List<List<MBean>> m) {
        this.m = m;
    }

    public static class IBean {
        /**
         * list : [{"name":"OBC美甲","img":"img/obcmeijia.jpg","lid":"209"},{"name":"OBC美发","img":"img/obcmeifa.jpg","lid":"210"},{"name":"半永久双线班","img":"img/byj.jpg","lid":"175"},{"name":"美睫双线班","img":"img/mmj.jpg","lid":"173"},{"name":"网红妆双线班","img":"img/wh.jpg","lid":"200"}]
         * img : http://api.dameiketang.com/Appapi/select/lessonimg/sx.jpg
         * name : 双线课专区
         */

        private String img;
        private String name;
        private List<ListBean> list;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * name : OBC美甲
             * img : img/obcmeijia.jpg
             * lid : 209
             */

            private String name;
            private String img;
            private String lid;

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

            public String getLid() {
                return lid;
            }

            public void setLid(String lid) {
                this.lid = lid;
            }
        }
    }

    public static class TBean {
        /**
         * 在职者 : {"id":"4","name":"在职者","type":"1"}
         * 美甲应用 : {"id":"5","name":"美甲应用","type":"2"}
         * 生活 : {"id":"6","name":"生活","type":"3"}
         * 职场 : {"id":"7","name":"职场","type":"3"}
         * 艺术 : {"id":"8","name":"艺术","type":"3"}
         * 美发应用 : {"id":"9","name":"美发应用","type":"2"}
         * 造型 : {"id":"10","name":"造型","type":"3"}
         * 洗护 : {"id":"11","name":"洗护","type":"3"}
         * 剪发 : {"id":"12","name":"剪发","type":"3"}
         * 烫染 : {"id":"13","name":"烫染","type":"3"}
         * 美学应用 : {"id":"14","name":"美学应用","type":"2"}
         * 素描 : {"id":"15","name":"素描","type":"3"}
         * 形象 : {"id":"16","name":"形象","type":"3"}
         * 色彩 : {"id":"17","name":"色彩","type":"3"}
         * DIY : {"id":"18","name":"DIY","type":"3"}
         * 化妆应用 : {"id":"19","name":"化妆应用","type":"2"}
         * 生活妆 : {"id":"20","name":"生活妆","type":"3"}
         * 舞台妆 : {"id":"21","name":"舞台妆","type":"3"}
         * 工作妆 : {"id":"22","name":"工作妆","type":"3"}
         * 特效化妆 : {"id":"23","name":"特效化妆","type":"3"}
         * 新娘妆 : {"id":"24","name":"新娘妆","type":"3"}
         * 整体造型 : {"id":"25","name":"整体造型","type":"3"}
         * 美容应用 : {"id":"26","name":"美容应用","type":"2"}
         * 基础美容 : {"id":"27","name":"基础美容","type":"3"}
         * 面部美容 : {"id":"28","name":"面部美容","type":"3"}
         * 塑造身体 : {"id":"29","name":"塑造身体","type":"3"}
         * SPA养生 : {"id":"30","name":"SPA养生","type":"3"}
         * 中医美容 : {"id":"31","name":"中医美容","type":"3"}
         * 经营者 : {"id":"32","name":"经营者","type":"1"}
         * 业绩倍增 : {"id":"33","name":"业绩倍增","type":"2"}
         * 经营管理 : {"id":"34","name":"经营管理","type":"2"}
         * 团队建设 : {"id":"35","name":"团队建设","type":"2"}
         * 资本运作 : {"id":"36","name":"资本运作","type":"2"}
         * 初学者 : {"id":"37","name":"初学者","type":"1"}
         * OBC美容 : {"id":"38","name":"OBC美容","type":"2"}
         * OBC美发 : {"id":"39","name":"OBC美发","type":"2"}
         * OBC化妆 : {"id":"40","name":"OBC化妆","type":"2"}
         * OBC美甲 : {"id":"41","name":"OBC美甲","type":"2"}
         * 爱好者课程 : {"id":"42","name":"爱好者课程","type":"1"}
         * 生活休闲 : {"id":"43","name":"生活休闲","type":"2"}
         * 职场经营 : {"id":"44","name":"职场经营","type":"2"}
         * 主题活动 : {"id":"45","name":"主题活动","type":"2"}
         * 塑形养生 : {"id":"46","name":"塑形养生","type":"2"}
         * 精品课 : {"id":"47","name":"精品课","type":"1"}
         * 后起之秀 : {"id":"48","name":"后起之秀","type":"2"}
         * 名师有约 : {"id":"49","name":"名师有约","type":"2"}
         * 双线课 : {"id":"50","name":"双线课","type":"1"}
         * 其它 : {"id":"51","name":"其它","type":"2"}
         * 在职双线班 : {"id":"52","name":"在职双线班","type":"2"}
         * OBC双线班 : {"id":"54","name":"OBC双线班","type":"2"}
         */

        private 在职者Bean 在职者;
        private 美甲应用Bean 美甲应用;
        private 生活Bean 生活;
        private 职场Bean 职场;
        private 艺术Bean 艺术;
        private 美发应用Bean 美发应用;
        private 造型Bean 造型;
        private 洗护Bean 洗护;
        private 剪发Bean 剪发;
        private 烫染Bean 烫染;
        private 美学应用Bean 美学应用;
        private 素描Bean 素描;
        private 形象Bean 形象;
        private 色彩Bean 色彩;
        private DIYBean DIY;
        private 化妆应用Bean 化妆应用;
        private 生活妆Bean 生活妆;
        private 舞台妆Bean 舞台妆;
        private 工作妆Bean 工作妆;
        private 特效化妆Bean 特效化妆;
        private 新娘妆Bean 新娘妆;
        private 整体造型Bean 整体造型;
        private 美容应用Bean 美容应用;
        private 基础美容Bean 基础美容;
        private 面部美容Bean 面部美容;
        private 塑造身体Bean 塑造身体;
        private SPA养生Bean SPA养生;
        private 中医美容Bean 中医美容;
        private 经营者Bean 经营者;
        private 业绩倍增Bean 业绩倍增;
        private 经营管理Bean 经营管理;
        private 团队建设Bean 团队建设;
        private 资本运作Bean 资本运作;
        private 初学者Bean 初学者;
        private OBC美容Bean OBC美容;
        private OBC美发Bean OBC美发;
        private OBC化妆Bean OBC化妆;
        private OBC美甲Bean OBC美甲;
        private 爱好者课程Bean 爱好者课程;
        private 生活休闲Bean 生活休闲;
        private 职场经营Bean 职场经营;
        private 主题活动Bean 主题活动;
        private 塑形养生Bean 塑形养生;
        private 精品课Bean 精品课;
        private 后起之秀Bean 后起之秀;
        private 名师有约Bean 名师有约;
        private 双线课Bean 双线课;
        private 其它Bean 其它;
        private 在职双线班Bean 在职双线班;
        private OBC双线班Bean OBC双线班;

        public 在职者Bean get在职者() {
            return 在职者;
        }

        public void set在职者(在职者Bean 在职者) {
            this.在职者 = 在职者;
        }

        public 美甲应用Bean get美甲应用() {
            return 美甲应用;
        }

        public void set美甲应用(美甲应用Bean 美甲应用) {
            this.美甲应用 = 美甲应用;
        }

        public 生活Bean get生活() {
            return 生活;
        }

        public void set生活(生活Bean 生活) {
            this.生活 = 生活;
        }

        public 职场Bean get职场() {
            return 职场;
        }

        public void set职场(职场Bean 职场) {
            this.职场 = 职场;
        }

        public 艺术Bean get艺术() {
            return 艺术;
        }

        public void set艺术(艺术Bean 艺术) {
            this.艺术 = 艺术;
        }

        public 美发应用Bean get美发应用() {
            return 美发应用;
        }

        public void set美发应用(美发应用Bean 美发应用) {
            this.美发应用 = 美发应用;
        }

        public 造型Bean get造型() {
            return 造型;
        }

        public void set造型(造型Bean 造型) {
            this.造型 = 造型;
        }

        public 洗护Bean get洗护() {
            return 洗护;
        }

        public void set洗护(洗护Bean 洗护) {
            this.洗护 = 洗护;
        }

        public 剪发Bean get剪发() {
            return 剪发;
        }

        public void set剪发(剪发Bean 剪发) {
            this.剪发 = 剪发;
        }

        public 烫染Bean get烫染() {
            return 烫染;
        }

        public void set烫染(烫染Bean 烫染) {
            this.烫染 = 烫染;
        }

        public 美学应用Bean get美学应用() {
            return 美学应用;
        }

        public void set美学应用(美学应用Bean 美学应用) {
            this.美学应用 = 美学应用;
        }

        public 素描Bean get素描() {
            return 素描;
        }

        public void set素描(素描Bean 素描) {
            this.素描 = 素描;
        }

        public 形象Bean get形象() {
            return 形象;
        }

        public void set形象(形象Bean 形象) {
            this.形象 = 形象;
        }

        public 色彩Bean get色彩() {
            return 色彩;
        }

        public void set色彩(色彩Bean 色彩) {
            this.色彩 = 色彩;
        }

        public DIYBean getDIY() {
            return DIY;
        }

        public void setDIY(DIYBean DIY) {
            this.DIY = DIY;
        }

        public 化妆应用Bean get化妆应用() {
            return 化妆应用;
        }

        public void set化妆应用(化妆应用Bean 化妆应用) {
            this.化妆应用 = 化妆应用;
        }

        public 生活妆Bean get生活妆() {
            return 生活妆;
        }

        public void set生活妆(生活妆Bean 生活妆) {
            this.生活妆 = 生活妆;
        }

        public 舞台妆Bean get舞台妆() {
            return 舞台妆;
        }

        public void set舞台妆(舞台妆Bean 舞台妆) {
            this.舞台妆 = 舞台妆;
        }

        public 工作妆Bean get工作妆() {
            return 工作妆;
        }

        public void set工作妆(工作妆Bean 工作妆) {
            this.工作妆 = 工作妆;
        }

        public 特效化妆Bean get特效化妆() {
            return 特效化妆;
        }

        public void set特效化妆(特效化妆Bean 特效化妆) {
            this.特效化妆 = 特效化妆;
        }

        public 新娘妆Bean get新娘妆() {
            return 新娘妆;
        }

        public void set新娘妆(新娘妆Bean 新娘妆) {
            this.新娘妆 = 新娘妆;
        }

        public 整体造型Bean get整体造型() {
            return 整体造型;
        }

        public void set整体造型(整体造型Bean 整体造型) {
            this.整体造型 = 整体造型;
        }

        public 美容应用Bean get美容应用() {
            return 美容应用;
        }

        public void set美容应用(美容应用Bean 美容应用) {
            this.美容应用 = 美容应用;
        }

        public 基础美容Bean get基础美容() {
            return 基础美容;
        }

        public void set基础美容(基础美容Bean 基础美容) {
            this.基础美容 = 基础美容;
        }

        public 面部美容Bean get面部美容() {
            return 面部美容;
        }

        public void set面部美容(面部美容Bean 面部美容) {
            this.面部美容 = 面部美容;
        }

        public 塑造身体Bean get塑造身体() {
            return 塑造身体;
        }

        public void set塑造身体(塑造身体Bean 塑造身体) {
            this.塑造身体 = 塑造身体;
        }

        public SPA养生Bean getSPA养生() {
            return SPA养生;
        }

        public void setSPA养生(SPA养生Bean SPA养生) {
            this.SPA养生 = SPA养生;
        }

        public 中医美容Bean get中医美容() {
            return 中医美容;
        }

        public void set中医美容(中医美容Bean 中医美容) {
            this.中医美容 = 中医美容;
        }

        public 经营者Bean get经营者() {
            return 经营者;
        }

        public void set经营者(经营者Bean 经营者) {
            this.经营者 = 经营者;
        }

        public 业绩倍增Bean get业绩倍增() {
            return 业绩倍增;
        }

        public void set业绩倍增(业绩倍增Bean 业绩倍增) {
            this.业绩倍增 = 业绩倍增;
        }

        public 经营管理Bean get经营管理() {
            return 经营管理;
        }

        public void set经营管理(经营管理Bean 经营管理) {
            this.经营管理 = 经营管理;
        }

        public 团队建设Bean get团队建设() {
            return 团队建设;
        }

        public void set团队建设(团队建设Bean 团队建设) {
            this.团队建设 = 团队建设;
        }

        public 资本运作Bean get资本运作() {
            return 资本运作;
        }

        public void set资本运作(资本运作Bean 资本运作) {
            this.资本运作 = 资本运作;
        }

        public 初学者Bean get初学者() {
            return 初学者;
        }

        public void set初学者(初学者Bean 初学者) {
            this.初学者 = 初学者;
        }

        public OBC美容Bean getOBC美容() {
            return OBC美容;
        }

        public void setOBC美容(OBC美容Bean OBC美容) {
            this.OBC美容 = OBC美容;
        }

        public OBC美发Bean getOBC美发() {
            return OBC美发;
        }

        public void setOBC美发(OBC美发Bean OBC美发) {
            this.OBC美发 = OBC美发;
        }

        public OBC化妆Bean getOBC化妆() {
            return OBC化妆;
        }

        public void setOBC化妆(OBC化妆Bean OBC化妆) {
            this.OBC化妆 = OBC化妆;
        }

        public OBC美甲Bean getOBC美甲() {
            return OBC美甲;
        }

        public void setOBC美甲(OBC美甲Bean OBC美甲) {
            this.OBC美甲 = OBC美甲;
        }

        public 爱好者课程Bean get爱好者课程() {
            return 爱好者课程;
        }

        public void set爱好者课程(爱好者课程Bean 爱好者课程) {
            this.爱好者课程 = 爱好者课程;
        }

        public 生活休闲Bean get生活休闲() {
            return 生活休闲;
        }

        public void set生活休闲(生活休闲Bean 生活休闲) {
            this.生活休闲 = 生活休闲;
        }

        public 职场经营Bean get职场经营() {
            return 职场经营;
        }

        public void set职场经营(职场经营Bean 职场经营) {
            this.职场经营 = 职场经营;
        }

        public 主题活动Bean get主题活动() {
            return 主题活动;
        }

        public void set主题活动(主题活动Bean 主题活动) {
            this.主题活动 = 主题活动;
        }

        public 塑形养生Bean get塑形养生() {
            return 塑形养生;
        }

        public void set塑形养生(塑形养生Bean 塑形养生) {
            this.塑形养生 = 塑形养生;
        }

        public 精品课Bean get精品课() {
            return 精品课;
        }

        public void set精品课(精品课Bean 精品课) {
            this.精品课 = 精品课;
        }

        public 后起之秀Bean get后起之秀() {
            return 后起之秀;
        }

        public void set后起之秀(后起之秀Bean 后起之秀) {
            this.后起之秀 = 后起之秀;
        }

        public 名师有约Bean get名师有约() {
            return 名师有约;
        }

        public void set名师有约(名师有约Bean 名师有约) {
            this.名师有约 = 名师有约;
        }

        public 双线课Bean get双线课() {
            return 双线课;
        }

        public void set双线课(双线课Bean 双线课) {
            this.双线课 = 双线课;
        }

        public 其它Bean get其它() {
            return 其它;
        }

        public void set其它(其它Bean 其它) {
            this.其它 = 其它;
        }

        public 在职双线班Bean get在职双线班() {
            return 在职双线班;
        }

        public void set在职双线班(在职双线班Bean 在职双线班) {
            this.在职双线班 = 在职双线班;
        }

        public OBC双线班Bean getOBC双线班() {
            return OBC双线班;
        }

        public void setOBC双线班(OBC双线班Bean OBC双线班) {
            this.OBC双线班 = OBC双线班;
        }

        public static class 在职者Bean {
            /**
             * id : 4
             * name : 在职者
             * type : 1
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 美甲应用Bean {
            /**
             * id : 5
             * name : 美甲应用
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 生活Bean {
            /**
             * id : 6
             * name : 生活
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 职场Bean {
            /**
             * id : 7
             * name : 职场
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 艺术Bean {
            /**
             * id : 8
             * name : 艺术
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 美发应用Bean {
            /**
             * id : 9
             * name : 美发应用
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 造型Bean {
            /**
             * id : 10
             * name : 造型
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 洗护Bean {
            /**
             * id : 11
             * name : 洗护
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 剪发Bean {
            /**
             * id : 12
             * name : 剪发
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 烫染Bean {
            /**
             * id : 13
             * name : 烫染
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 美学应用Bean {
            /**
             * id : 14
             * name : 美学应用
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 素描Bean {
            /**
             * id : 15
             * name : 素描
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 形象Bean {
            /**
             * id : 16
             * name : 形象
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 色彩Bean {
            /**
             * id : 17
             * name : 色彩
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class DIYBean {
            /**
             * id : 18
             * name : DIY
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 化妆应用Bean {
            /**
             * id : 19
             * name : 化妆应用
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 生活妆Bean {
            /**
             * id : 20
             * name : 生活妆
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 舞台妆Bean {
            /**
             * id : 21
             * name : 舞台妆
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 工作妆Bean {
            /**
             * id : 22
             * name : 工作妆
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 特效化妆Bean {
            /**
             * id : 23
             * name : 特效化妆
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 新娘妆Bean {
            /**
             * id : 24
             * name : 新娘妆
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 整体造型Bean {
            /**
             * id : 25
             * name : 整体造型
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 美容应用Bean {
            /**
             * id : 26
             * name : 美容应用
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 基础美容Bean {
            /**
             * id : 27
             * name : 基础美容
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 面部美容Bean {
            /**
             * id : 28
             * name : 面部美容
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 塑造身体Bean {
            /**
             * id : 29
             * name : 塑造身体
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class SPA养生Bean {
            /**
             * id : 30
             * name : SPA养生
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 中医美容Bean {
            /**
             * id : 31
             * name : 中医美容
             * type : 3
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 经营者Bean {
            /**
             * id : 32
             * name : 经营者
             * type : 1
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 业绩倍增Bean {
            /**
             * id : 33
             * name : 业绩倍增
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 经营管理Bean {
            /**
             * id : 34
             * name : 经营管理
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 团队建设Bean {
            /**
             * id : 35
             * name : 团队建设
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 资本运作Bean {
            /**
             * id : 36
             * name : 资本运作
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 初学者Bean {
            /**
             * id : 37
             * name : 初学者
             * type : 1
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class OBC美容Bean {
            /**
             * id : 38
             * name : OBC美容
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class OBC美发Bean {
            /**
             * id : 39
             * name : OBC美发
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class OBC化妆Bean {
            /**
             * id : 40
             * name : OBC化妆
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class OBC美甲Bean {
            /**
             * id : 41
             * name : OBC美甲
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 爱好者课程Bean {
            /**
             * id : 42
             * name : 爱好者课程
             * type : 1
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 生活休闲Bean {
            /**
             * id : 43
             * name : 生活休闲
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 职场经营Bean {
            /**
             * id : 44
             * name : 职场经营
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 主题活动Bean {
            /**
             * id : 45
             * name : 主题活动
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 塑形养生Bean {
            /**
             * id : 46
             * name : 塑形养生
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 精品课Bean {
            /**
             * id : 47
             * name : 精品课
             * type : 1
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 后起之秀Bean {
            /**
             * id : 48
             * name : 后起之秀
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 名师有约Bean {
            /**
             * id : 49
             * name : 名师有约
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 双线课Bean {
            /**
             * id : 50
             * name : 双线课
             * type : 1
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 其它Bean {
            /**
             * id : 51
             * name : 其它
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class 在职双线班Bean {
            /**
             * id : 52
             * name : 在职双线班
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class OBC双线班Bean {
            /**
             * id : 54
             * name : OBC双线班
             * type : 2
             */

            private String id;
            private String name;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class DBean {
        /**
         * name : 精品专区
         * id : 47
         * type : 1
         * original :
         * img : http://api.dameiketang.com/Appapi/select/lessonimg/jp.jpg
         */

        private String name;
        private String id;
        private String type;
        private String original;
        private String img;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getOriginal() {
            return original;
        }

        public void setOriginal(String original) {
            this.original = original;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }
    }

    public static class MBean {
        /**
         * name : 精品全部
         * id : 47
         * type : 1
         */

        private String name;
        private String id;
        private String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
