Vue.http.options.emulateJSON = true;
Vue.http.options.emulateHTTP = true;
Vue.component('treeselect', VueTreeselect.Treeselect);
var vm = new Vue({
    data: {
        el: '#app',
        valueConsistsOf: 'LEAF_PRIORITY',
        options1:"",
        value:null
    },
    //初始化方法
    mounted:function () {
        debugger
        this.findZNodes();

    },
    methods: {
        //加载修改树结构json
        findZNodes: function () {
            debugger
            this.$http.post("/org/findOrgUserTree").then(function (response) {
                debugger
                this.options1 = response.data;
            })
        }
    }
})

