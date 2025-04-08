const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmj0759/",
            name: "ssmj0759",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmj0759/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "酒吧存酒系统"
        } 
    }
}
export default base
