	import {
		createRouter,
		createWebHashHistory
	} from 'vue-router'
	import news from '@/views/news/list'
	import discussdiandongche from '@/views/discussdiandongche/list'
	import address from '@/views/address/list'
	import yonghu from '@/views/yonghu/list'
	import chat from '@/views/chat/list'
	import diandongche from '@/views/diandongche/list'
	import orders from '@/views/orders/list'
	import storeup from '@/views/storeup/list'
	import config from '@/views/config/list'
	import users from '@/views/users/list'
	import cheliangleixing from '@/views/cheliangleixing/list'

export const routes = [{
		path: '/login',
		name: 'login',
		component: () => import('../views/login.vue')
	},{
		path: '/',
		name: '首页',
		component: () => import('../views/index'),
		children: [{
			path: '/',
			name: '首页',
			component: () => import('../views/HomeView.vue'),
			meta: {
				affix: true
			}
		}, {
			path: '/updatepassword',
			name: '修改密码',
			component: () => import('../views/updatepassword.vue')
		}
		
		,{
			path: '/news',
			name: '公告信息',
			component: news
		}
		,{
			path: '/discussdiandongche',
			name: '电动车评论评论',
			component: discussdiandongche
		}
		,{
			path: '/address',
			name: '地址',
			component: address
		}
		,{
			path: '/yonghu',
			name: '用户',
			component: yonghu
		}
		,{
			path: '/chat',
			name: '在线客服',
			component: chat
		}
		,{
			path: '/diandongche',
			name: '电动车',
			component: diandongche
		}
		,{
			path: '/orders',
			name: '订单管理',
			component: orders
		}
		,{
			path: '/storeup',
			name: '我的收藏',
			component: storeup
		}
		,{
			path: '/config',
			name: '轮播图',
			component: config
		}
		,{
			path: '/users',
			name: '管理员',
			component: users
		}
		,{
			path: '/cheliangleixing',
			name: '车辆类型',
			component: cheliangleixing
		}
		]
	},
]

const router = createRouter({
	history: createWebHashHistory(process.env.BASE_URL),
	routes
})

export default router
