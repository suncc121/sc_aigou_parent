package cn.itsource.aigou.common;

/**
 * 返回结果类的封装
 */
public class AjaxResult {

    public static void main(String[] args){
        AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject("asdasdas");
    }

    private boolean success=true;//操作是否成功
    private String msg="操作成功";
    private Object object=null;//返回后台的数据信息


    public static AjaxResult me(){
        return new AjaxResult();
    }


    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}
