package com.atguigu06.project.model.service;

import com.atguigu06.project.model.domain.Architect;
import com.atguigu06.project.model.domain.Designer;
import com.atguigu06.project.model.domain.Employee;
import com.atguigu06.project.model.domain.Programmer;

/**
 * ClassName: TeamService
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 18:53
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1; // 给 memberId 进行自动赋值的基数
    private final int MAX_MEMBER = 5; // 开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER]; // 开发团队的数组

    private int total = 0;

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {
        if (total > MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加。");
        }
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status) {
            case BUSY -> throw new TeamException("该员工已是某团队的员工");
            case VOCATION -> throw new TeamException("该员工正在休假，无法添加");
        }
        if (isExist(p)) {
            throw new TeamException("该员工已在开发团队中");
        }
        // 记录程序员，设计师，架构师的数量
        int progNum = 0, desNum = 0, arcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else {
                progNum++;
            }
        }
        if (p instanceof Architect) {
            if (arcNum >= 1)
                throw new TeamException("团队中最多只能有一名架构师");
        } else if (p instanceof Designer) {
            if (desNum >= 2)
                throw new TeamException("团队中最多只能有两名设计师");
        } else {
            if (progNum >= 3) {
                throw new TeamException("团队中最多只能有三名程序员");
            }
        }
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    public void removeMember(int memberId) throws TeamException {
        if (isExist(memberId)) {
            for (int i = 0; i < total; i++) {
                if (team[i].getMemberId() == memberId) {
                    team[i].setStatus(Status.FREE);
                    for (int j = i; j < total - 1; j++) {
                        team[j] = team[j + 1];
                    }
                    team[--total] = null;
                    break;
                }

            }
        } else {
            throw new TeamException("为找到指定的 memberId 员工，删除失败");
        }
    }

    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    private boolean isExist(int memberId) {
        for (int i = 0; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                return true;
            }
        }
        return false;
    }
}
