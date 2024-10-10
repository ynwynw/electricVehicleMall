import { createRouter, createWebHashHistory } from 'vue-router'
import index from '../views'
import home from '../views/pages/home.vue'
import login from '../views/pages/login.vue'
import newsList from '@/views/pages/news/list'
import yonghuList from '@/views/pages/yonghu/list'
import yonghuDetail from '@/views/pages/yonghu/formModel'
import yonghuAdd from '@/views/pages/yonghu/formAdd'
import yonghuRegister from '@/views/pages/yonghu/register'
import yonghuCenter from '@/views/pages/yonghu/center'
import cheliangleixingList from '@/views/pages/cheliangleixing/list'
import cheliangleixingDetail from '@/views/pages/cheliangleixing/formModel'
import cheliangleixingAdd from '@/views/pages/cheliangleixing/formAdd'
import diandongcheList from '@/views/pages/diandongche/list'
import diandongcheDetail from '@/views/pages/diandongche/formModel'
import diandongcheAdd from '@/views/pages/diandongche/formAdd'
import storeupList from '@/views/pages/storeup/list'
import cartList from '@/views/pages/shop_order/cart'
import addressList from '@/views/pages/shop_address/list'
import order_confirm from '@/views/pages/shop_order/confirm'
import ordersList from '@/views/pages/shop_order/list'

const routes = [{
		path: '/',
		redirect: '/index/home'
	},
	{
		path: '/index',
		component: index,
		children: [{
			path: 'home',
			component: home
		}
		, {
			path: 'newsList',
			component: newsList
		}
		, {
			path: 'yonghuList',
			component: yonghuList
		}, {
			path: 'yonghuDetail',
			component: yonghuDetail
		}, {
			path: 'yonghuAdd',
			component: yonghuAdd
		}
		, {
			path: 'yonghuCenter',
			component: yonghuCenter
		}
		, {
			path: 'cheliangleixingList',
			component: cheliangleixingList
		}, {
			path: 'cheliangleixingDetail',
			component: cheliangleixingDetail
		}, {
			path: 'cheliangleixingAdd',
			component: cheliangleixingAdd
		}
		, {
			path: 'diandongcheList',
			component: diandongcheList
		}, {
			path: 'diandongcheDetail',
			component: diandongcheDetail
		}, {
			path: 'diandongcheAdd',
			component: diandongcheAdd
		}
		, {
			path: 'storeupList',
			component: storeupList
		}
		, {
			path: 'cartList',
			component: cartList
		}
		, {
			path: 'addressList',
			component: addressList
		}
		, {
			path: 'order_confirm',
			component: order_confirm
		}
		, {
			path: 'ordersList',
			component: ordersList
		}
		]
	},
	{
		path: '/login',
		component: login
	}
	,{
		path: '/yonghuRegister',
		component: yonghuRegister
	}
]

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes
})

export default router
