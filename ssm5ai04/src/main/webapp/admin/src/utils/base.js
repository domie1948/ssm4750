const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm5ai04/",
            name: "ssm5ai04",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5ai04/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "设备配件管理和设备检修系统"
        } 
    }
}
export default base
