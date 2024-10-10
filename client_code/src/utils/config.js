const config = {
    get() {
        return {
            url : process.env.VUE_APP_BASE_API_URL + process.env.VUE_APP_BASE_API + '/',
            name: process.env.VUE_APP_BASE_API,
			menuList:[
				{
					name: '电动车',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'电动车',
							url:'/index/diandongcheList'
						},
					]
				},
				{
					name: '购物车',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'购物车',
							url:'/index/cartList'
						},
					]
				},
				{
					name: '在线客服',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'在线客服',
							url:'chat'
						},
					]
				},
			]
        }
    },
    getProjectName(){
        return {
            projectName: "电动车销售系统"
        } 
    }
}
export default config
