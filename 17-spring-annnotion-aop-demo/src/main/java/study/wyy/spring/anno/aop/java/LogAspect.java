package study.wyy.spring.anno.aop.java;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: wyaoyao
 * @date: 2020-12-24 16:01
 * @description:
 */
@Slf4j
public class LogAspect {


    /***
     * 前置通知: 在方法执行之前进行日志打印
     *
     * */
    public void beforeLog(Object... params) {
        if (null != params && params.length > 0) {
            StringBuffer sf = new StringBuffer("[");
            for (Object param : params) {
                sf.append(param.toString());
                sf.append(",");
            }
            sf.append("]");
            log.info("execute method with params is {}", sf.toString());
        } else {
            log.info("execute method  with no params ");
        }
    }

    /***
     * 后置通知: 在目标方法执行后实施增强，比如在方法执行结束后，打印日志
     * */
    public void afterReturningLog() {
        log.info("execute success ...");
    }

    /***
     * 异常通知
     *  发生异常的时候执行
     * */
    public void afterThrowingLog(Exception e, Object... params) {
        if (null != params && params.length > 0) {
            StringBuffer sf = new StringBuffer("[");
            for (Object param : params) {
                sf.append(param.toString());
                sf.append(",");
            }
            sf.append("]");
            log.info("execute method error {} with params {}", e.getMessage(),sf.toString(),e);
        } else {
            log.info("execute method error {} ",e.getMessage(),e);
        }
    }

}
