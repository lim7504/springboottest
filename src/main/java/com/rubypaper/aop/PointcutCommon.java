package com.rubypaper.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {

    @Pointcut("execution(* com.rubypaper.board..*Impl.*(..))")
    public void allPointcut() {}

    @Pointcut("execution(* com.rubypaper.board..*Impl.get*(..))")
    public void getPointcut() {}


}
