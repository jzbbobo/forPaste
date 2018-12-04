trademak
2015-5-28 下午6:36
The parent task id is used for sub tasks in Activiti. So we don't store the previous task in the parent task id, because in most cases there's no parent-child relationship there. By reading the BpmnModel representation of the BPMN XML you would be able to determine the previous task as well, and you could determine if there's parallel behaviour or not.

Best regards,
喜欢 • 显示 0 喜欢0  操作 
