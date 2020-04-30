[![MIT License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](LICENSE)![GitHub release](https://img.shields.io/github/release/takkii/Chart.svg?style=flat)[![GitHub Status](https://img.shields.io/github/last-commit/takkii/Chart.svg?style=flat)](GitHub)

### Chart_java

![Chart](https://github.com/takkii/Chart/blob/master/piechart.png)

[jfreechart_downloads](https://sourceforge.net/projects/jfreechart/files/1.%20JFreeChart/1.0.19/jfreechart-1.0.19.zip/download)

### javaでChart制作、画像はPowerPointでも使用可能。

```markdown
jcommon-*.jar
jfreechart-*.jar
```
### jfreechart/lib

*※ ライブラリーとしてIDEに追加します。*

### プログラミング言語人気ランキング (2020年4月)

[PYPL PopularitY of Programming Language](http://pypl.github.io/PYPL.html)

![Chart_lang](https://github.com/takkii/Chart/blob/master/piechart_lang_else.png)

*サンプルですが、更新もしていきます... (ランキング5位までにRubyはなかった...)*

```markdown
https://github.com/takkii/Chart.git
cd Chart/out/artifacts/Chart
java -jar main.jar
```

### mvnで自分ビルド

```markdown
https://github.com/takkii/Chart.git
cd Chart
rm -rf target

mvn package
java -jar target/App-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### GitHub Packegeにも登録しました。

```markdown
GitHub package / Chart.App

右側ファイルアイコン(App-1.0-20200430.081444-1-jar-with-dependencies.jar)からダウンロード

cd ダウンロード先
java -jar App-1.0-20200430.081444-1-jar-with-dependencies.jar
```

*※ 検証としてmavenを走らせました。*

#### Javaでチャート表示するプロジェクト...

```markdown
動作確認

OpenJDK8
OracleJDK8
```

#### 以上
