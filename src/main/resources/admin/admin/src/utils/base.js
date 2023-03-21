const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot7ezu4/",
            name: "springboot7ezu4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot7ezu4/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SpringBoot+Vue框架的个人博客系统"
        } 
    }
}
export default base
