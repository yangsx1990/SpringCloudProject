package com.ysx;


import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/** ������������
 * @author  saixing_yang@hiersun.com
 * @date ����ʱ�䣺2017��1��4�� ����11:04:29 
 * @version 1.0 
 */
public class AccessFilter extends ZuulFilter {

	/*filterType������һ���ַ�����������������ͣ���zuul�ж��������ֲ�ͬ�������ڵĹ��������ͣ��������£�
	pre������������·��֮ǰ����
	routing����·������ʱ�򱻵���
	post����routing��error������֮�󱻵���
	error����������ʱ��������ʱ������
	filterOrder��ͨ��intֵ�������������ִ��˳��
	shouldFilter������һ��boolean�������жϸù������Ƿ�Ҫִ�У�����ͨ���˺�����ʵ�ֹ������Ŀ��ء��������У�����ֱ�ӷ���true�����Ըù�����������Ч��
	run���������ľ����߼�����Ҫע�⣬��������ͨ��ctx.setSendZuulResponse(false)��zuul���˸����󣬲��������·�ɣ�Ȼ��ͨ��ctx.setResponseStatusCode(401)�������䷵�صĴ����룬��Ȼ����Ҳ���Խ�һ���Ż����ǵķ��أ����磬ͨ��ctx.setResponseBody(body)�Է���body���ݽ��б༭�ȡ�
	*/
	@Override
	public Object run() {
		 RequestContext ctx = RequestContext.getCurrentContext();
	        HttpServletRequest request = ctx.getRequest();
	        Object accessToken = request.getParameter("accessToken");  //����url�б������accessToken����
	        if(accessToken == null) {
	            ctx.setSendZuulResponse(false);
	            ctx.setResponseStatusCode(401);
	            return null;
	        }
	        return null;
	    
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
