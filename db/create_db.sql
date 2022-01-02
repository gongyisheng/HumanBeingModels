drop table if exists `ods_socialnetwork_model_runtime_origin_log`;
create table `ods_socialnetwork_model_runtime_origin_log`
(
    `id`               bigint not null auto_increment comment 'unique id for db',
    `model_id`         bigint not null comment 'unique id for each model',
    `round`            int not null comment 'the round of the data',
    `average_score`    double comment 'average visiting score of this round',
    `recom_count`      int comment 'total recommendation count of this round',
    primary key (`id`)
)
    engine = innodb
    default charset = utf8mb4 comment 'runtime origin log';


drop table if exists `ods_socialnetwork_model_parameter_origin_log`;
create table `ods_socialnetwork_model_parameter_origin_log`
(
    `id`               bigint not null auto_increment comment 'unique id for db',
    `model_id`         bigint not null comment 'unique id for each model',
    `grid_length`      int comment 'grid length',
    `population`       int comment 'population',
    `rounds`           int comment 'total rounds',
    `recom_type`       int comment 'recommendation type',
    `start_time`       bigint comment 'the timestamp start running',
    primary key (`id`)
)
    engine = innodb
    default charset = utf8mb4 comment 'parameter origin_log';
