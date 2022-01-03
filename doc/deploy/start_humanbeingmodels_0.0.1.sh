#!/bin/bash
echo "publish----------"

# shellcheck disable=SC2006
# shellcheck disable=SC2009
process_id=`ps -ef | grep HumanBeingModels.jar | grep -v grep |awk '{print $2}'`
if [ "$process_id" ] ; then
sudo kill -9 "$process_id"
fi

source /etc/profile
# shellcheck disable=SC2164
cd /root/humanbeingmodels/0.0.1
nohup java -jar -Dspring.profiles.active=prod HumanBeingModels.jar >/root/hbm.0.0.1.log &
tail -f /root/hbm.0.0.1.log

echo "end publish"
