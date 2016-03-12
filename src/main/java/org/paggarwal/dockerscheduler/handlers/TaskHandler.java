package org.paggarwal.dockerscheduler.handlers;

import com.google.common.collect.ImmutableMap;
import org.paggarwal.dockerscheduler.RequestHandlerWrapper;
import org.paggarwal.dockerscheduler.Answer;
import org.paggarwal.dockerscheduler.models.Task;
import org.paggarwal.dockerscheduler.service.db.TaskService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by paggarwal on 3/7/16.
 */
@Service
public class TaskHandler {
    @Inject
    private TaskService taskService;

    public RequestHandlerWrapper<EmptyPayload> list() {
        return new RequestHandlerWrapper<EmptyPayload>(EmptyPayload.TYPE_REFERENCE,(value, urlParams) -> {
            return new Answer(200,taskService.list());
        });
    }

    public RequestHandlerWrapper<Task> create() {
        return new RequestHandlerWrapper<Task>(Task.TYPE_REFERENCE,(value, urlParams) -> {
            return new Answer(201,ImmutableMap.of("id",taskService.create(value)));
        });
    }

    public RequestHandlerWrapper<EmptyPayload> delete() {
        return new RequestHandlerWrapper<EmptyPayload>(EmptyPayload.TYPE_REFERENCE,(value, urlParams) -> {
            return new Answer(200,ImmutableMap.of("status", taskService.delete((int) Integer.parseInt(urlParams.get(":id")))));
        });
    }
}
