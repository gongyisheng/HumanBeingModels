import React,{Component} from 'react';
import PostItem from './PostItem';

class PostList extends Component{
    constructor(props){
        super(props);
        this.state = {
            news:[
                {
                    title:"大家一起来讨论React吧",
                    author:"张三",
                    date:"2017-09-01 10:00"
                }
            ]
        };
    }
    handle_click = ()=>{
        let t = this;
        fetch("/data", {method: 'GET'}).then(
            function (res) {
                console.log(res);
                res.json().then(function (data) {
                        console.log(data);
                        t.setState({
                            news:data
                        });
                    }
                )
            });
    };
    render() {
        return (
            <div>
                <button onClick={this.handle_click}>button</button>
                <br/>
                帖子列表：
                {this.state.news.map((item,i) =>
                    <div key={i}>
                        <PostItem
                            title = {item.title}
                            author = {item.author}
                            date = {item.date}
                        />
                    </div>
                )}
            </div>
        );
    }
}

export default PostList;