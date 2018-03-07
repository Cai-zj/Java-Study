记录工作中想法

UEditor使用:
  图文并排过程中,保存内容持久化的时候,我们需要做一些处理,将上传的图片或视频上传路径另外
保存在对应的表中.此时,就显得很不方便.
接手项目之前.原处理是进行正则图片URL进行保存.
   
  为了更好更快捷实现,在用js处理,从内容中获取指定节点值.
解决思路：获取编辑器中的内容，转化为uNode节点，再获取指定Node节点进行遍历，即可任意操作了。

js代码实现：

var root = UE.htmlparser(UE.getEditor('editor' ).getContent(), true);
var imgs = new Array();
var imgs = root.getNodesByTagName('img' );
for (i=0;i&lt;imgs.length;i++){
    alert(imgs[i].getAttr( 'src'));
}